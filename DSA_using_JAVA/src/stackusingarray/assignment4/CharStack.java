package stackusingarray.assignment4;

public class CharStack {
    private int top;
    private int size;
    private char []arr;

    public CharStack(){
        top = -1;
        size = 5;
        arr = new char[size];
    }

    public CharStack(int size){
        this.size = size;
        this.top = -1;
        this.arr = new char[size];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==(size-1);
    }

    public void push(char no){
        if(!isFull()){
            arr[++top] = no;
        }
        else{
            System.out.println("Stack overflow. Can not push.");
        }
    }

    public char pop(){
        char res = '\0';
        if(!isEmpty()){
            res = arr[top--];
        }
        return res;
    }

    public char peak(){
        char res = '\0';
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
