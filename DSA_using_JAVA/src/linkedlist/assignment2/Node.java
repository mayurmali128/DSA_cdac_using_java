package linkedlist.assignment2;

public class Node {
    String data;
    Node next;

    public Node(){
        data ="Default";
        next = null;
    }

    public Node(String data){
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return data + " ";
    }
}
