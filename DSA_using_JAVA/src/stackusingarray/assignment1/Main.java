package stackusingarray.assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack st = new MyStack(5);

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
                    System.out.println("Enter number to push: ");
                    int no = sc.nextInt();
                    st.push(no);
                    break;
                case 2:
                    int p = st.pop();
                    if(p==Integer.MIN_VALUE){
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
                    int peak = st.peak();
                    if(peak == Integer.MIN_VALUE){
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
