public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(new Node(1));
        stack.push(new Node(2));
        stack.push(new Node(3));
        stack.push(new Node(4));

        stack.showStack();

        stack.showTop();

        stack.pop();
        stack.showTop();
        stack.pop();
        stack.showTop();
        stack.pop();
        stack.showTop();

        stack.pop();
        stack.pop();




    }
}
