public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.first());

        queue.dequeue();
        System.out.println(queue.first());
        queue.dequeue();
        System.out.println(queue.first());

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println(queue);

//        Using generics to avoid queuing different types of data
//        Like in the example below:
//        queue.enqueue("error");
    }
}