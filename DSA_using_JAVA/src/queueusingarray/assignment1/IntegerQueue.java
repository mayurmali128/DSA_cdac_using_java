package queueusingarray.assignment1;

public class IntegerQueue {
    private int front,rear,size;
    private int []arr;

    public IntegerQueue(){
        front = rear = -1;
        arr = new int[5];
    }

    public IntegerQueue(int size){
        front = rear = -1;
        this.size = size;
        arr = new int[size];
    }

    public boolean isEmpty(){
        return front==-1;
    }

    public boolean isFull(){
        return rear == size-1;
    }

    public void enqueue(int data){
        if(!isFull()){
            if(front==-1)
                front = 0;

            arr[++rear] = data;
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
                front =rear = -1;
            }
            else{
                front++;
            }
        }
        return res;
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for(int i= front; i<=rear; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
