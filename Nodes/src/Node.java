public class Node<T> {
    private T nodeContent;
    private Node<T> nextNode;

    public Node(T nodeContent) {
        this.nodeContent = nodeContent;
        this.nextNode = null;
    }


    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public T getNodeContent() {
        return nodeContent;
    }

    public void setNodeContent(T nodeContent) {
        this.nodeContent = nodeContent;
    }

    @Override
    public String toString() {
        return "Node{" +
                "Content:'" + nodeContent + '\'' +
                '}';
    }
}
