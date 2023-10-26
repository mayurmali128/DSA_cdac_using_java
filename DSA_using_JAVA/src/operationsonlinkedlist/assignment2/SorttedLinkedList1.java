package operationsonlinkedlist.assignment2;

import operationsonlinkedlist.assignment1.Node;

import java.util.Scanner;

public class SorttedLinkedList1 {
    Node head;

    public SorttedLinkedList1(){
        head = null;
    }

    public void insertSorted(int data){
        Node temp = new Node(data);

        //if head is null
        if(head==null){
            head = temp;
        }
        else{
            Node curr = head;

            //if only one element in list
            if(head.next==null){
                if(head.data<temp.data){
                    head.next = temp;
                }
                else{
                    temp.next = head;
                    head = temp;
                }
            }
            else{
                if(head.data> temp.data){
                    temp.next = head;
                    head = temp;
                }
                else {
                    while (curr.next != null &&curr.next.data<temp.data){
                        curr = curr.next;
                    }

                    temp.next = curr.next;
                    curr.next = temp;
                }
            }
        }
    }

    public void createLinkedList(int n){
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n; i++){
            System.out.println("Enter "+ (i+1)+ " element: ");
            insertSorted(sc.nextInt());
        }
    }

    public void printLinkedList(){
        Node curr = head;

        while (curr != null){
            System.out.print(curr + "->");
            curr=curr.next;
        }
        System.out.print("NULL");
    }

}
