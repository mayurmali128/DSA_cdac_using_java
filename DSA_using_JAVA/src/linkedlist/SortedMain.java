package linkedlist;

public class SortedMain {
    public static void main(String[] args) {
        SortedLinkedList ls = new SortedLinkedList();
        ls.insertSorted(20);
        ls.insertSorted(10);
        ls.insertSorted(5);
        ls.insertSorted(9);
        ls.insertSorted(100);
        ls.insertSorted(150);
        ls.insertSorted(2);

        ls.printLinkedList();
    }
}
