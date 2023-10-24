package queueusingarray.assignment2;

public class CustomerQueue {
    private int front,rear,size;
    private Customer []arr;

    public CustomerQueue(){
        front = rear = -1;
        arr = new Customer[5];
    }

    public CustomerQueue(int size){
        front = rear = -1;
        this.size = size;
        arr = new Customer[size];
    }

    public boolean isEmpty(){
        return front==-1;
    }

    public boolean isFull(){
        return rear == size-1;
    }

    public void enqueue(Customer data){
        if(!isFull()){
            if(front==-1)
                front = 0;

            arr[++rear] = data;
        }
        else{
            System.out.println("Queue is full.");
        }
    }

    public Customer dequeue(){
        Customer res = null;

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
