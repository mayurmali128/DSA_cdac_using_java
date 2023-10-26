package operationsonlinkedlist.assignment1;

import java.util.Scanner;

public class MyLinkedList {
    Node head;

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

    public void delete(int data){
        boolean flag = false;

        if(head.data == data){
            head = head.next;
            flag = true;
        }
        else{
            Node curr = head;
            while(curr.next != null && curr.next.data != data){
                curr = curr.next;
            }
            if(curr.next != null){
                flag = true;
                curr.next = curr.next.next;
            }
        }
        if (!(flag)){
            System.out.println("No element found.");
        }
    }

    public void printReverse(Node n1){
        if(n1 != null){
            printReverse(n1.next);
            System.out.println(n1);
        }
    }

    public int getSize(){
        int cnt = 0;
        Node curr = head;

        while(curr != null){
            cnt++;
            curr = curr.next;
        }
        return cnt;
    }

    public void insertNodeAtPos(int pos, int data){
        Node temp = new Node(data);
        int size = getSize();
        if(pos>0 || pos<=size+1){
            if(pos==1){
                temp.next = head;
                head = temp;
            }
            else{
                int i = 1;
                Node curr = head;
                while(i<pos-1){
                    curr = curr.next;
                    i++;
                }
                temp.next = curr.next;
                curr.next = temp;
            }
        }
        else{
            System.out.println("Please enter valid position.");
        }
    }

    public void printMid(){

        if(head==null){
            System.out.println("List is empty.");
            return;
        }

        if(head.next == null){
            System.out.println("Mid: "+ head.data);
            return;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Mid element is: "+ slow.data);
    }

    public void printLinkedList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
