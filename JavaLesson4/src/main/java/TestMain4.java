public class TestMain4 {

    public static void main(String[] args) {
        testLinkedList();
    }

    private static void testLinkedList() {
        var linkedList = new TwoSideLinkedListImpl<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        linkedList.insertFirst(6);
        linkedList.insertFirst(7);
        linkedList.insertFirst(8);
        linkedList.insertLast(9);
        linkedList.insertLast(10);

        linkedList.display();

        System.out.println("Find 1: " + linkedList.contains(1));
        System.out.println("Find 2: " + linkedList.contains(2));
        System.out.println("Find 5: " + linkedList.contains(5));
        System.out.println("Find 80: " + linkedList.contains(80));

        linkedList.removeFirst();
        linkedList.remove(4);

        linkedList.display();

       for (Object value : linkedList) {
            System.out.println("value: " + value);
        }
    }

}
