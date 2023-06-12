public class Stack {
    private Node entryReferenceNode;

    public Stack() {
        this.entryReferenceNode = null;
    }

    public Node top() {
        return entryReferenceNode;
    }

    public void showTop() {
        System.out.println("The top of the stack is -> " + entryReferenceNode.getNodeContent());
    }

    public Node pop() {
        if (!this.isEmpty()) {
            Node popedNode = entryReferenceNode;
            entryReferenceNode = entryReferenceNode.getPreviousNode();
            return popedNode;
        } else {
            System.out.println("The stack is empty");
            return null;
        }
    }

    public void push(Node node) {
        Node auxReference = entryReferenceNode;
        entryReferenceNode = node;
        entryReferenceNode.setPreviousNode(auxReference);
    }

    public boolean isEmpty() {
        return entryReferenceNode == null;
    }


    public String showStack(){
        String stringReturn = "----------------\n";
        stringReturn += "     Stack\n";
        stringReturn += "----------------\n";

        Node auxNode = entryReferenceNode;

        while (true) {
            if (auxNode != null) {
                stringReturn += "[Node{content=" + auxNode.getNodeContent() + "}]\n";
                auxNode = auxNode.getPreviousNode();
            } else {
                break;
            }
        }

        stringReturn += "================\n";

        System.out.println(stringReturn);
        return stringReturn;
    }
}