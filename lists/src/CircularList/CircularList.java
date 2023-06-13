package CircularList;

public class CircularList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int listSize;

    public CircularList() {
        this.head = null;
        this.tail = null;
        this.listSize = 0;
    }

    public void add(T content) {
        Node<T> newNode = new Node<>(content);
        if(this.isEmpty()) {
            this.head = newNode;
            this.tail = this.head;
            this.head.setNextNode(this.tail);
        } else {
            newNode.setNextNode(this.tail);
            this.head.setNextNode(newNode);
            this.tail = newNode;
        }
        this.listSize++;
    }

    public void remove(int index) {
        if(index >= this.listSize)
            throw new IndexOutOfBoundsException("The index is greater than the list size");

        Node<T> nodeAux = this.tail;
        if(index == 0) {
            this.tail = this.tail.getNextNode();
            this.head.setNextNode(this.tail);
        } else if(index == 1) {
            this.tail.setNextNode(this.tail.getNextNode().getNextNode());
        } else {
            for(int i = 0; i < index - 1; i++) {
                nodeAux = nodeAux.getNextNode();

            }
            nodeAux.setNextNode(nodeAux.getNextNode().getNextNode());
        }
        this.listSize--;
    }

    private Node<T> getNodeByIndex(int index) {
        if(this.isEmpty())
            throw new IndexOutOfBoundsException("The list is empty");

        if(index == 0)
            return this.tail;

        Node<T> nodeAux = tail;
        for(int i = 0; (i < index) && (nodeAux != null); i++) {
            nodeAux = nodeAux.getNextNode();
        }
        return nodeAux;
    }

    public T get(int index){
        return this.getNodeByIndex(index).getContent();
    }

    public int size() {
        return this.listSize;
    }

    public boolean isEmpty() {
        return this.listSize == 0;
    }

    @Override
    public String toString() {
        String str = "";
        Node<T> nodeAux = tail;
        for(int i = 0; i < this.size(); i++) {
            str += "[No{content=" + nodeAux.getContent() + "}]--->";
            nodeAux = nodeAux.getNextNode();
        }

        if(this.size() != 0)
            str += "(head)";

        return str;
    }
}
