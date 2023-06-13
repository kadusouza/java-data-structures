package LinkedLists;

public class LinkedList<T> {

    Node<T> entryReferenceNode;

    public LinkedList() {
        this.entryReferenceNode = null;
    }

    public void add(T content) {
        Node<T> novoNo = new Node<>(content);
        if(this.isEmpty()) {
            entryReferenceNode = novoNo;
            return;
        }

        Node<T> nodeAux = entryReferenceNode;
        for(int i = 0; i < this.size() - 1; i++) {
            nodeAux = nodeAux.getNextNode();
        }
        nodeAux.setNextNode(novoNo);
    }

    private Node<T> getNodeByIndex(int index) {
        validateIndex(index);

        Node<T> nodeAux = entryReferenceNode;
        Node<T> nodeReturn = null;

        for(int i = 0; i <= index; i++) {
            nodeReturn = nodeAux;
            nodeAux = nodeAux.getNextNode();
        }
        return nodeReturn;
    }

    public T get(int index) {
        return getNodeByIndex(index).getContent();
    }

    public T remove(int index) {
        Node<T> nodeAux = this.getNodeByIndex(index);
        if(index == 0) {
            entryReferenceNode = nodeAux.getNextNode();
            return nodeAux.getContent();
        }

        Node<T> previousNode = getNodeByIndex(index - 1);
        previousNode.setNextNode(nodeAux.getNextNode());
        return nodeAux.getContent();
    }

    public int size() {
        int listSize = 0;
        Node<T> nodeAux = entryReferenceNode;
        while (true) {
            if(nodeAux != null) {
                listSize++;
                if(nodeAux.getNextNode() != null)
                    nodeAux = nodeAux.getNextNode();
                else
                    break;

            } else {
                break;
            }
        }
        return listSize;
    }

    private void validateIndex(int index) {
        if(index >= size()) {
            int lastIndex = size() - 1;
            throw new IndexOutOfBoundsException(index + "index not on the list," +
                    " it only goes up to" + lastIndex);
        }

    }

    public boolean isEmpty() {
        return entryReferenceNode == null;
    }

    @Override
    public String toString() {
        String str = "";
        Node<T> nodeAux = entryReferenceNode;
        for(int i = 0; i < this.size(); i++) {
            str += "[No{content=" + nodeAux.getContent() + "}]--->";
            nodeAux = nodeAux.getNextNode();
        }
        str += "null";

        return str;
    }
}
