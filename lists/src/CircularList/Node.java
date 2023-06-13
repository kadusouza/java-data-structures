package CircularList;

public class Node<T> {
    private T content;
    private Node<T> nextNode;

    public Node() {
        this.nextNode = null;
    }
    public Node(T content) {
        this.content = content;
        this.nextNode = null;
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
