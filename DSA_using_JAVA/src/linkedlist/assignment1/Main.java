package linkedlist.assignment1;

public class Main {
    public static void main(String[] args) {

        MyLinkedList l1 = new MyLinkedList();
        l1.createLinkedList(5);
        l1.printLinkedList();
        System.out.println("\nLinked list after adding one element.");
        l1.insertAtEnd(10);
        l1.printLinkedList();
    }
}
