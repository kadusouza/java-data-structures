public class Queue<T> {

    private Node<T> entryReferenceNode;

    public Queue() {
        this.entryReferenceNode = null;
    }

    public void enqueue(T object) {
        Node node = new Node(object);
        node.setReferenceNode(entryReferenceNode);
        entryReferenceNode = node;
    }

    public T dequeue() {
        if(!this.isEmpty()) {
            Node firstNode = entryReferenceNode;
            Node secondNode = entryReferenceNode;
            while (firstNode.getReferenceNode() != null) {
                secondNode = firstNode;
                firstNode = firstNode.getReferenceNode();
            }
            secondNode.setReferenceNode(null);
            return (T) secondNode.getObject();
        }
        return null;
    }

    public T first() {
        if(!this.isEmpty()) {
            Node firstNode = entryReferenceNode;
            while (firstNode.getReferenceNode() != null) {
                firstNode = firstNode.getReferenceNode();
            }
            return (T) firstNode.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return entryReferenceNode == null;
    }

    @Override
    public String toString() {
        String returnString = "";
        Node auxNode = entryReferenceNode;

        if (entryReferenceNode != null) {
            while (true) {
                returnString += "[Node{object=" + auxNode.getObject() + "}]--->";
                if (auxNode.getReferenceNode() != null) {
                    auxNode = auxNode.getReferenceNode();
                } else {
                    returnString += "null";
                    break;
                }
            }
        } else {
            returnString = "null";
        }
        return returnString;
    }
}
