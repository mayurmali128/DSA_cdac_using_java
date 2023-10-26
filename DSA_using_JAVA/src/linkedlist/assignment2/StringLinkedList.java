package linkedlist.assignment2;

public class StringLinkedList {
    Node head;

    public StringLinkedList(){
        head = null;
    }

    public void addAtEnd(String data){
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
    public void addAtBeg(String data){
        Node temp = new Node(data);

        if(head==null){
            head = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
    }

    public void printFirstNode(){
        if(head==null){
            System.out.println("Linked list is empty.");
        }
        else{
            System.out.println(head);
        }
    }

    public void printLastNode(){

        if(head==null){
            System.out.println("Linked list is empty.");
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        System.out.println(temp);
    }

    public int getsize(){
        int res = 0;
        Node temp = head;
        while(temp!=null){
            res++;
            temp = temp.next;
        }
        return res;
    }

    private boolean isPresent(String str){
        Node temp = head;
        while(temp != null){
            if(temp.data.equals(str)){
                return true;
            }
            temp = temp.next;
        }
        return  false;
    }
    public void modify(String str1, String str2){
        if(!(isPresent(str1))){
            System.out.println("Given string is not present in linked list.");
        }
        else{
            Node temp = head;

            while(!(temp.data.equals(str1))){
                temp = temp.next;
            }
            temp.data = str2;
        }
    }

    public void modify(int pos, String str){
        int len = getsize();

        if(pos<=0 || pos>len){
            System.out.println("Position is not valid.");
        }
        else{
            Node temp = head;
            int cnt =1;
            while(cnt!=pos && temp != null){
                cnt++;
                temp = temp.next;
            }

            if(temp != null)
                temp.data = str;

        }
    }
    public void createLinkedList(String[] arr){
        for(String s: arr){
            addAtEnd(s);
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
