package linkedlist;


class Node{
    public int data;
    public Node next;

    public Node(){
        data = 0;
        next = null;
    }
    public Node(int data){
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return data + " ";
    }
}

public class SortedLinkedList {
    Node head;

    public SortedLinkedList(){
        head = null;
    }

    public void insertSorted(int data){
        Node temp = new Node(data);
        if(head==null){
            head = temp;
        }
        else{
            Node curr = head;

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

    public void printLinkedList(){
        Node curr = head;

        while (curr != null){
            System.out.print(curr + "->");
            curr=curr.next;
        }
    }
}
