package operationsonlinkedlist.assignment4;
import operationsonlinkedlist.assignment3.MyLinkedList;
import operationsonlinkedlist.assignment3.Node;

public class Merge {

    public static void mergeLinkedList(MyLinkedList l1, MyLinkedList l2){
        Node curr = l1.head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = l2.head;
        System.out.println("Merged linked list: ");
        l1.printLinkedList();
    }
    public static void main(String[] args) {
        MyLinkedList l1 = new MyLinkedList();
        MyLinkedList l2 = new MyLinkedList();
        System.out.println("1 list");
        l1.createLinkedList(5);
        System.out.println("2nd list: ");
        l2.createLinkedList(5);

        System.out.println("1 list");
        l1.printLinkedList();
        System.out.println("2nd list: ");
        l2.printLinkedList();
        
        System.out.println("Merged linked list:");
        mergeLinkedList(l1,l2);
    }

}
