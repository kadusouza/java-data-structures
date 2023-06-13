package DoublyLinkedLists;

public class Node<T> {
    private T content;
    private Node<T> nextNode;
    private Node<T> previousNode;


    public Node(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node<T> previousNode) {
        this.previousNode = previousNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content=" + content +
                '}';
    }

    public String toStringLinked() {
        String str = "Node{" +
                "content=" + content +
                '}';
        if(nextNode != null) {
            str += " -> " + nextNode.toStringLinked();
        } else {
             str += " -> null";
        }
        return str;
    }


}
