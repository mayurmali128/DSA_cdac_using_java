package operationsonlinkedlist.assignment3;

public class Node {
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
        return data+ " ";
    }
}
