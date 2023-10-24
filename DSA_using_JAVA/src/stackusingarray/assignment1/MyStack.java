package stackusingarray.assignment1;

public class MyStack {
    private int top;
    private int size;
    private int []arr;

    public MyStack(){
        top = -1;
        size = 5;
        arr = new int[size];
    }

    public MyStack(int size){
        this.size = size;
        this.top = -1;
        this.arr = new int[size];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==(size-1);
    }

    public void push(int no){
        if(!isFull()){
            arr[++top] = no;
        }
        else{
            System.out.println("Stack overflow. Can not push.");
        }
    }

    public int pop(){
        int res = Integer.MIN_VALUE;
        if(!isEmpty()){
            res = arr[top--];
        }
        return res;
    }

    public int peak(){
        int res = Integer.MIN_VALUE;
        if(!isEmpty()){
            res = arr[top];
        }
        return res;
    }

    public void display(){
        for(int i=top; i>=0; i--){
            System.out.println(arr[i]);
        }
    }

}
