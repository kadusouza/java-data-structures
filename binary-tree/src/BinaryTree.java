public class BinaryTree<T extends Comparable<T>> {

    private BinNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(T content) {
        BinNode<T> newNode = new BinNode<>(content);
        this.root = insert(this.root, newNode);
    }

    private BinNode<T> insert(BinNode<T> currentNode, BinNode<T> newNode) {
        if(currentNode == null) {
            return newNode;
        } else if(newNode.getContent().compareTo(currentNode.getContent()) < 0) {
            currentNode.setLeftNode(insert(currentNode.getLeftNode(), newNode));
        } else {
            currentNode.setRightNode(insert(currentNode.getRightNode(), newNode));
        }
        return currentNode;
    }

    public void printInOrder() {
        System.out.println("\nPrinting in order:");
        printInOrder(this.root);
    }

    private void printInOrder(BinNode<T> currentNode) {
        if(currentNode != null) {
            printInOrder(currentNode.getLeftNode());
            System.out.print(currentNode.getContent() + ", ");
            printInOrder(currentNode.getRightNode());
        }
    }

    public void printPostOrder() {
        System.out.println("\nPrinting post order:");
        printPostOrder(this.root);
    }

    private void printPostOrder(BinNode<T> currentNode) {
        if(currentNode != null) {
            printPostOrder(currentNode.getLeftNode());
            printPostOrder(currentNode.getRightNode());
            System.out.print(currentNode.getContent() + ", ");
        }
    }

    public void printPreOrder() {
        System.out.println("\nPrinting pre order:");
        printPreOrder(this.root);
    }

    private void printPreOrder(BinNode<T> currentNode) {
        if(currentNode != null) {
            System.out.print(currentNode.getContent() + ", ");
            printPreOrder(currentNode.getLeftNode());
            printPreOrder(currentNode.getRightNode());
        }
    }

    public void remove(T content) {
        try {
            BinNode<T> currentNode = this.root;
            BinNode<T> fatherNode = null;
            BinNode<T> sonNode = null;
            BinNode<T> tempNode = null;

            while (currentNode != null && !currentNode.getContent().equals(content)) {
                fatherNode = currentNode;
                if(content.compareTo(currentNode.getContent()) < 0) {
                    currentNode = currentNode.getLeftNode();
                } else {
                    currentNode = currentNode.getRightNode();
                }
            }

            if(currentNode == null) {
                System.out.println("Content not found. Nothing to remove.");
            } else if(fatherNode == null) {
                if(currentNode.getRightNode() == null) {
                    this.root = currentNode.getLeftNode();
                } else if(currentNode.getLeftNode() == null) {
                    this.root = currentNode.getRightNode();
                } else {
                    for(tempNode = currentNode, sonNode = currentNode.getLeftNode();
                        sonNode.getRightNode() != null;
                        tempNode = sonNode, sonNode = sonNode.getLeftNode()) {
                        if(sonNode != currentNode.getLeftNode()) {
                            tempNode.setRightNode(sonNode.getLeftNode());
                            sonNode.setLeftNode(this.root.getLeftNode());
                        }
                        sonNode.setRightNode(this.root.getRightNode());
                        this.root = sonNode;
                    }
                }
            } else if(currentNode.getRightNode() == null) {
                if(fatherNode.getLeftNode() == currentNode) {
                    fatherNode.setLeftNode(currentNode.getLeftNode());
                } else {
                    fatherNode.setRightNode(currentNode.getLeftNode());
                }
            } else if(currentNode.getLeftNode() == null) {
                if(fatherNode.getLeftNode() == currentNode) {
                    fatherNode.setLeftNode(currentNode.getRightNode());
                } else {
                    fatherNode.setRightNode(currentNode.getRightNode());
                }
            } else {
                for(tempNode = currentNode, sonNode = currentNode.getLeftNode();
                    sonNode.getRightNode() != null;
                    tempNode = sonNode, sonNode = sonNode.getRightNode()) {
                    if(sonNode != currentNode.getLeftNode()) {
                        tempNode.setRightNode(sonNode.getLeftNode());
                        sonNode.setLeftNode(currentNode.getLeftNode());
                    }
                    sonNode.setRightNode(currentNode.getRightNode());
                    if(fatherNode.getLeftNode() == currentNode) {
                        fatherNode.setLeftNode(sonNode);
                    } else {
                        fatherNode.setRightNode(sonNode);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Content not found. Nothing to remove.");
        }
    }

}
