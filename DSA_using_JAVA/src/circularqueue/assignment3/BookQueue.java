package circularqueue.assignment3;

public class BookQueue {
    private int front,rear,size;
    private Book []arr;

    public BookQueue(){
        front = rear = -1;
        size = 5;
        arr = new Book[size];
    }

    public BookQueue(int size){
        front = rear = -1;
        this.size = size;
        arr = new Book[size];
    }

    public boolean isFull(){
        return (rear+1)%size == front;
    }

    public boolean isEmpty(){
        return front ==-1;
    }

    public void enqueue(Book data){

        if(!isFull()) {
            if (front == -1)
                front = 0;

            rear = (rear + 1) % size;
            arr[rear] = data;
        }
        else{
            System.out.println("Queue is full.");
        }
    }

    public Book dequeue(){
        Book res = null;

        if(!isEmpty()){
            res = arr[front];
            if(front==rear){
                front = rear = -1;
            }
            else
                front = (front + 1)%size;
        }
        return res;
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Queue: ");
        int i;
        for(i=front; i!=rear; i = (i+1)%size){
            System.out.print(arr[i] + " ");
        }

        if(i==rear)
            System.out.println(arr[rear]);

    }
}
