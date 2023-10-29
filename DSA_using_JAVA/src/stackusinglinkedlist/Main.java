package stackusinglinkedlist;

import java.util.Scanner;

public class Main {
    public static int getMin(Node top){
        int mini = Integer.MAX_VALUE;
        Node curr = top;

        while(curr != null){

            if(mini>curr.data)
                mini = curr.data;

            curr = curr.next;
        }
        return mini;
    }
    public static void main(String[] args){
        myStack st = new myStack();
        Scanner sc = new Scanner(System.in);
        int ch =0;
        do {
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Print top element.");
            System.out.println("4.Print all stack.");
            System.out.println("5.Get min from stack.");
            System.out.println("0.Exit");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Enter element to push: ");
                    st.push(sc.nextInt());
                    break;
                case 2:
                    try {
                        System.out.println("Popped element: " + st.pop());
                    }
                    catch (myStackException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Element at top: " + st.getTop());
                    }
                    catch (myStackException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Stack: "+ st);
                    break;
                case 5:
                    try {
                        System.out.println("Minimum element of stack is: " + getMin(st.getTop()));
                    }
                    catch (myStackException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please enter valid choice.");
                    break;
            }
        }while (ch!=0);
    }
}
