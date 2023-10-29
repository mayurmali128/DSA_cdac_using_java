package circularlinkedlist;

import searching.assignment2.CountComparisonBinarySearch;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class CircularLinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }

        @Override
        public String toString() {
            return data+ " ";
        }
    }

    Node head;

    public CircularLinkedList(){
        head = null;
    }

    public void insertAtEnd(int data){
        Node temp = new Node(data);

        if(head==null){
            head = temp;
            head.next = head;
        }
        else{
            Node curr = head;
            while (curr.next != head){
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
        }
    }

    public void insertAtStart(int data){
        Node temp = new Node(data);
        if(head==null){
            head = temp;
            head.next = head;
        }
        else{
            temp.next = head;
            Node curr = head;
            while(curr.next!=head){
                curr = curr.next;
            }
            curr.next = temp;
            head = temp;
        }
    }

    public void createLinkedList(int n){
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n; i++){
            System.out.println("Enter "+(i+1)+ " element:");
            insertAtEnd(sc.nextInt());
        }
    }

    public int getSize(){
        if(head==null) return 0;
        Node curr = head;
        int cnt = 1;
        while(curr.next!=head){
            cnt++;
            curr = curr.next;
        }
        return  cnt;
    }
    public void insertAtPos(int pos, int data){
        int size =getSize();
        if(pos<=0 || pos>size+1){
            System.out.println("Please enter valid position.");
            return;
        }
        if(pos==1){
            insertAtStart(data);
        }
        else if(pos==size+1){
            insertAtEnd(data);
        }
        else{
            Node temp = new Node(data);
            Node curr = head;
            for(int i=1; i<pos-1; i++)
                curr = curr.next;

            temp.next = curr.next;
            curr.next = temp;
        }
    }

    public void deleteBeg(){
        if(head==null){
            System.out.println("Linked list is empty.");
            return;
        }
        Node curr = head;
        while(curr.next != head){
            curr= curr.next;
        }
        if(curr==head){
            head= null;
            return;
        }

        curr.next = curr.next.next;
        head = head.next;

    }

    public void deleteEnd(){
        if(head==null){
            System.out.println("Linked list is empty. ");
            return;
        }
        if(head.next == null){
            deleteBeg();
        }
        else{
            Node curr = head;
            while (curr.next.next != head){
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
    }

    public void deletePos(int pos){
        int size = getSize();
        if(pos<=0 && pos>size){
            System.out.println("Please Enter valid position.");
        }
        else{
            if(pos==1)
                deleteBeg();
            else if(pos==size)
                deleteEnd();

            else{
                Node temp = head;
                for(int i=1; i<pos-1; i++)
                    temp = temp.next;
                temp.next = temp.next.next;
            }
        }
    }
    @Override
    public String toString() {
        String res = "";

        if(head==null) return res;
        Node curr = head;

        while (curr.next!=head){
            res += (curr+"->");
            curr = curr.next;
        }
        res += (curr.data + "->"+ "head");
        return res;
    }
}
