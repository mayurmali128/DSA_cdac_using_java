package linkedlist;

//class Node{
//    public int data;
//    public Node next;
//
//    public Node(){
//        data = 0;
//        next = null;
//    }
//    public Node(int data){
//        this.data = data;
//        this.next = null;
//    }
//
//    @Override
//    public String toString() {
//        return data + " ";
//    }
//}

class myLink{

    private Node head;

    public myLink(){
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

    public Node getMid(){
        if(head==null) return null;
        if(head.next==null) return head;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

public class Practice {
    public static void main(String[] args) {
        myLink l1 = new myLink();
        l1.createLinkedList(4);
        l1.printLinkedList();
        System.out.println("\n Mid="+ l1.getMid());
    }
}
