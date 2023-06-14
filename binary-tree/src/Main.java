public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> myBinaryTree = new BinaryTree<Integer>();
        myBinaryTree.insert(13);
        myBinaryTree.insert(10);
        myBinaryTree.insert(25);
        myBinaryTree.insert(2);
        myBinaryTree.insert(12);
        myBinaryTree.insert(20);
        myBinaryTree.insert(31);
        myBinaryTree.insert(29);

        myBinaryTree.printPreOrder();
        myBinaryTree.printInOrder();
        myBinaryTree.printPostOrder();
        System.out.println("\n");

        myBinaryTree.insert(32);

        myBinaryTree.printPreOrder();
        myBinaryTree.printInOrder();
        myBinaryTree.printPostOrder();

        System.out.println("\n");

        myBinaryTree.remove(25);

        myBinaryTree.printPreOrder();
        myBinaryTree.printInOrder();
        myBinaryTree.printPostOrder();

    }
}