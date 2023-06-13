package DoublyLinkedLists;

public class DoublyLinkedList<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int listSize;

    public DoublyLinkedList() {
        this.firstNode = null;
        this.lastNode = null;
        this.listSize = 0;
    }

    public void remove(int index) {
        if(index == 0) {
            firstNode = firstNode.getNextNode();
            if(firstNode != null) {
                firstNode.setPreviousNode(null);
            }
        } else {
            Node<T> nodeAux = getNodeByIndex(index);
            nodeAux.getPreviousNode().setNextNode(nodeAux.getNextNode());
            if(nodeAux != lastNode) {
                nodeAux.getNextNode().setPreviousNode(nodeAux.getPreviousNode());
            } else {
                lastNode = nodeAux;
            }
        }
        listSize--;
    }

    private Node<T> getNodeByIndex(int index) {
        Node<T> nodeAux = firstNode;

        for(int i = 0; (i < index) && (nodeAux != null); i++) {
            nodeAux = nodeAux.getNextNode();
        }
        return nodeAux;
    }

    public void add(T content) {
        Node<T> newNode = new Node<>(content);
        newNode.setNextNode(null);
        newNode.setPreviousNode(lastNode);

        if(firstNode == null)
            firstNode = newNode;
        else if (lastNode != null)
            lastNode.setNextNode(newNode);

        lastNode = newNode;
        listSize++;
    }

    public void add(int index, T content) {
        Node<T> nodeAux = getNodeByIndex(index);
        Node<T> newNode = new Node<>(content);
        newNode.setNextNode(nodeAux);

        if(newNode.getNextNode() != null) {
            newNode.setPreviousNode(nodeAux.getPreviousNode());
            newNode.getNextNode().setPreviousNode(newNode);
        } else {
            newNode.setPreviousNode(lastNode);
            lastNode = newNode;
        }

        if(index == 0) {
            firstNode = newNode;
        } else {
            newNode.getPreviousNode().setNextNode(newNode);
        }
        listSize++;
    }

    public T get(int index){
        return this.getNodeByIndex(index).getContent();
    }

    public int size() {
        return this.listSize;
    }

    @Override
    public String toString() {
        String str = "";
        Node<T> nodeAux = firstNode;
        for(int i = 0; i < this.size(); i++) {
            str += "[No{content=" + nodeAux.getContent() + "}]--->";
            nodeAux = nodeAux.getNextNode();
        }
        str += "null";

        return str;
    }
}
