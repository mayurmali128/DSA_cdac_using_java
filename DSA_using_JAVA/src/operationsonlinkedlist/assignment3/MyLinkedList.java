package operationsonlinkedlist.assignment3;

import java.util.Scanner;

public class MyLinkedList {
    public Node head;

    public MyLinkedList(){
        head = null;
    }

    public void createLinkedList(int n){
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n; i++){
            System.out.println("Enter "+ (i+1)+ " element: ");
            insertAtEnd(sc.nextInt());
        }
    }
    public void insertAtEnd(int data){
        Node temp = new Node(data);

        if(head==null){
            head = temp;
        }
        else{
            Node curr = head;

            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = temp;
        }
    }

    public void printLinkedList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public void split(){
        MyLinkedList l1 = new MyLinkedList();
        MyLinkedList l2 = new MyLinkedList();

        Node curr = head;

        while(curr != null){
            if(curr.data%2==0){
                l1.insertAtEnd(curr.data);
            }
            else{
                l2.insertAtEnd(curr.data);
            }
            curr = curr.next;
        }

        System.out.println("\nEven: ");
        l1.printLinkedList();
        System.out.println("\nOdd: ");
        l2.printLinkedList();
    }
}
