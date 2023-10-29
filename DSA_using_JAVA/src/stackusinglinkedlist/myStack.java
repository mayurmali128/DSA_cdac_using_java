package stackusinglinkedlist;

public class myStack {
//    static class Node{
//        int data;
//        Node next;
//        public Node(int data){
//            this.data = data;
//            next = null;
//        }
//
//        @Override
//        public String toString() {
//            return data + " ";
//        }
//    }

    Node top;

    public myStack(){
        top = null;
    }

    public boolean isEmpty(){
        return top==null;
    }

    public void push(int data){
        Node temp = new Node(data);
        if(isEmpty()){
            top = temp;
        }
        else{
            temp.next = top;
            top = temp;
        }
    }

    public int pop() throws myStackException {
        if(isEmpty())
            throw  new myStackException();

        int res = top.data;
        top = top.next;
        return res;
    }

    public int getTop() throws myStackException{
        if(isEmpty())
            throw  new myStackException();
        return top.data;
    }

    public String toString(){
        try {
            if (isEmpty())
                throw new myStackException();
        }
        catch (myStackException e){
            System.out.println(e.getMessage());
        }
        String str = "";
        Node curr = top;

        while (curr != null){
            str += (curr + "->");
            curr = curr.next;
        }
        str += "null";
        return str;
    }
}
