package circularqueue.assignment1;

public class CircularQueue {
    private int front,rear,size;
    private int []arr;

    public CircularQueue(){
        front = rear = -1;
        size = 5;
        arr = new int[size];
    }

    public CircularQueue(int size){
        front = rear = -1;
        this.size = size;
        arr = new int[size];
    }

    public boolean isFull(){
        return (rear+1)%size == front;
    }

    public boolean isEmpty(){
        return front ==-1;
    }

    public void enqueue(int data){

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

    public int dequeue(){
        int res = Integer.MIN_VALUE;

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
