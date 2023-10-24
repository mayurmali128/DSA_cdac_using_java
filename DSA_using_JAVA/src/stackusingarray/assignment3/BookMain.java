package stackusingarray.assignment3;
import Introductiontodatastructures.assignment9.Book;
//import stackusingarray.assignment1.MyStack;

import java.util.Scanner;
import java.util.Stack;

public class BookMain {
    public static void main(String[] args) {
        BookStack st = new BookStack(5);
        Scanner sc = new Scanner(System.in);

        int ch= 0;

        do{
            System.out.println("\t Enter your choise: ");
            System.out.println("\t 1.Push() ");
            System.out.println("\t 2.Pop() ");
            System.out.println("\t 3.Check stack is full or not.");
            System.out.println("\t 4.Check stack is empty or not.");
            System.out.println("\t 5.Get peek element of stack. ");
            System.out.println("\t 6.Display()");
            System.out.println("\t 0. exit");
            System.out.println("\t Please enter your value: ");
            ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Enter book information to push: ");
                    System.out.println("Enter book id: ");
                    int bookid = sc.nextInt();
                    System.out.println("Enter book name: ");
                    sc.nextLine();
                    String bookname = sc.nextLine();
                    System.out.println("Enter book price: ");
                    double price = sc.nextDouble();
                    Book b = new Book(bookid,bookname,price);
                    st.push(b);
                    break;
                case 2:
                    Book p = st.pop();
                    if(p==null){
                        System.out.println("Stack ins underflow. Can not delete.");
                    }
                    else{
                        System.out.println("Deleted element is: "+ p);
                    }
                    break;
                case 3:
                    if(st.isFull()){
                        System.out.println("The stack is full.");
                    }
                    else{
                        System.out.println("Staclk is not full.");
                    }
                    break;
                case 4:
                    if(st.isEmpty()){
                        System.out.println("Stack is empty.");
                    }
                    else{
                        System.out.println("Stack is not empty.");
                    }
                    break;
                case 5:
                    Book peak = st.peak();
                    if(peak == null){
                        System.out.println("Stack underflow. Can not get peak value.");
                    }
                    else{
                        System.out.println("Peak element is: "+ peak);
                    }
                    break;
                case 6:
                    System.out.println("All Stack: ");
                    st.display();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please enter valid choise.");
                    break;
            }
        }while(ch!=0);
    }
}
