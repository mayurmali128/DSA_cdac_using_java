package circularqueue.assignment2;

public class SpecialCircularQueue {
    private int front,rear,size;
    private int []arr;

    public SpecialCircularQueue(){
        front = rear = -1;
        size = 5;
        arr = new int[size];
    }

    public SpecialCircularQueue(int size){
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

        if (front == -1)
            front = 0;

        rear = (rear + 1) % size;
        arr[rear] = data;
        if(isFull())
            front = (front +1)%size;

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
        
        //for printing rear
        System.out.println(arr[rear]);

    }
}
