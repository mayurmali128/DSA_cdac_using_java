package stackusingarray.assignment3;

import Introductiontodatastructures.assignment9.Book;

public class BookStack {
    private int top;
    private int size;
    private Book []arr;

    public BookStack(){
        top = -1;
        size = 5;
        arr = new Book[size];
    }

    public BookStack(int size){
        this.size = size;
        this.top = -1;
        this.arr = new Book[size];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==(size-1);
    }

    public void push(Book b){
        if(!isFull()){
            arr[++top] = b;
        }
        else{
            System.out.println("Stack overflow. Can not push.");
        }
    }

    public Book pop(){
        Book res = null;
        if(!isEmpty()){
            res = arr[top--];
        }
        return res;
    }

    public Book peak(){
        Book res = null;
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
