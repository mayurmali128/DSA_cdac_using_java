package linkedlist.assignment1;

public class MyLinkedList {
    private Node head;

    public MyLinkedList(){
        head = null;
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

    public void createLinkedList(int n){

        for(int i=1; i<=5; i++){
            insertAtEnd(i*5);
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
}
