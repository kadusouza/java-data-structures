public class Node {
    private int nodeContent;
    private Node previousNode;

    public Node(int nodeContent) {
        this.nodeContent = nodeContent;
        this.previousNode = null;
    }

    public int getNodeContent() {
        return nodeContent;
    }

    public void setNodeContent(int nodeContent) {
        this.nodeContent = nodeContent;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode =  previousNode;
    }


    @Override
    public String toString() {
        return "Node -> " + nodeContent;
    }
}
