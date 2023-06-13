package DoublyLinkedLists;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.add("first");
        doublyLinkedList.add("second");
        doublyLinkedList.add("third");
        doublyLinkedList.add("fourth");
        doublyLinkedList.add("fifth");
        doublyLinkedList.add("sixth");

        System.out.println(doublyLinkedList);

        doublyLinkedList.remove(3);
        doublyLinkedList.add(3, "element99");
        System.out.println(doublyLinkedList);
        System.out.println(doublyLinkedList.get(3));
    }
}
