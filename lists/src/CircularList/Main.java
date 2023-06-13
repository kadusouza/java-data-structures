package CircularList;

public class Main {
    public static void main(String[] args) {
        CircularList<String> myCircularList = new CircularList<String>();
        myCircularList.add("test1");
        myCircularList.add("test2");
        myCircularList.add("test3");
        myCircularList.add("test4");
        myCircularList.add("test5");
        myCircularList.add("test6");

        System.out.println(myCircularList.get(0));
        System.out.println(myCircularList);

        myCircularList.remove(3);
        System.out.println(myCircularList);

        for (int i = 0; i < 15; i++) {
            System.out.println(myCircularList.get(i));
        }

    }
}
