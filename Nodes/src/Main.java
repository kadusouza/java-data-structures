public class Main {
    public static void main(String[] args) {

        Node<String> node1 = new Node<>("Node 1");

        Node<String> node2 = new Node<>("Node 2");
        node1.setNextNode(node2);


        Node<String> node3 = new Node<>("Node 3");
        node2.setNextNode(node3);

        Node<String> node4 = new Node<>("Node 4");
        node3.setNextNode(node4);

        System.out.println(node1);
        System.out.println(node1.getNextNode().toString());
        System.out.println(node1.getNextNode().getNextNode().toString());
        System.out.println(node1.getNextNode().getNextNode().getNextNode().toString());

    }
}