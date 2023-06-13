package LinkedLists;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        myLinkedList.add("test4");
        myLinkedList.add("test5");
        myLinkedList.add("test6");

        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList);

        System.out.println(myLinkedList.remove(3));
        System.out.println(myLinkedList);
    }
}
