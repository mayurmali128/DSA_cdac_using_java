package doublylinkedlist;

public class MyLinkedList5 {
    static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        @Override
        public String toString() {
            return data + " ";
        }
    }

    Node head;

    public MyLinkedList5(){
        head = null;
    }

    public void addEnd(int data){
        Node temp = new Node(data);
        if(head==null){
            head = temp;
        }
        else{
            Node curr = head;
            while (curr.next != null){
                curr = curr.next;
            }

            curr.next = temp;
            temp.prev = curr;
        }
    }

    public void addStart(int data){
        Node temp = new Node(data);
        if(head==null){
            head = temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    private boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public void createLinkedListofPrime(int n){
        int cnt = 0;
        int num= 2;
        while(cnt<n){
            if(isPrime(num)){
                cnt++;
                addEnd(num);
            }
            num++;
        }
    }

    public int size(){
        int res = 0;
        Node curr = head;
        while(curr != null){
            res++;
            curr = curr.next;
        }
        return res;
    }

    public void printReverse(){
        Node curr= head;
        while (curr.next != null){
            curr = curr.next;
        }
        while(curr != null){
            System.out.print(curr+ "->");
            curr = curr.prev;
        }
        System.out.print("null");
    }

    public boolean isPresent(int key){
        Node curr = head;
        while (curr != null){
            if(curr.data==key) return true;
            curr = curr.next;
        }
        return false;
    }

    @Override
    public String toString() {
        String res = "";
        Node curr = head;
        while (curr != null){
            res += (curr + "->");
            curr = curr.next;
        }
        res += "null";

        return  res;
    }

    void insertAtPos(int pos, int data){
        int size = size();
        if(pos<0 || pos>size+1){
            System.out.println("Please enter valid position.");
            return;
        }
        if(pos==1)
            addStart(data);
        else if(pos==size+1)
            addEnd(data);
        else{
            Node curr = head;

            for(int i=1; i<pos-1; i++)
                curr = curr.next;

            Node temp = new Node(data);
            temp.next = curr.next;
            curr.prev = temp;
            curr.next = temp;
            temp.prev = curr;
        }
    }

    public void delete(int data){
        if(!isPresent(data)){
            System.out.println("Data not present");
        }
        else{
            if(data==head.data){
                head = head.next;
                head.prev = null;
            }
            else{
                Node curr = head;
                while (curr.next != null){
                    if(curr.next.data==data){
                        Node del = curr.next;
                        if(del.next != null)
                            del.next.prev = del.prev;
                        curr.next = del.next;
                        del = null;
                        break;
                    }
                    curr = curr.next;
                }
            }
        }
    }
}
