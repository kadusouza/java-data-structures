public class Node<T> {
    private T object;
    private Node<T> referenceNode;

    public Node() {
    }

    public Node(T object) {
        this.referenceNode = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Node getReferenceNode() {
        return referenceNode;
    }

    public void setReferenceNode(Node referenceNode) {
        this.referenceNode = referenceNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "node=" + object +
                '}';
    }
}
