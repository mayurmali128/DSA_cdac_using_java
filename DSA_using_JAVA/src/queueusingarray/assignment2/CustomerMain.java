package queueusingarray.assignment2;

import queueusingarray.assignment1.IntegerQueue;

import java.util.Scanner;

public class CustomerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerQueue q = new CustomerQueue(3);
        int ch = 0;
        do{
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Print queue.");
            System.out.println("0. exit");
            System.out.println("Enter your choise: ");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter customer id: ");
                    int id = sc.nextInt();
                    System.out.println("Enter customer name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Enter amount: ");
                    double amount = sc.nextDouble();
                    Customer c = new Customer(id,name,amount);
                    q.enqueue(c);
                    break;
                case 2:
                    Customer del = q.dequeue();
                    if(del == null){
                        System.out.println("Queue is empty.");
                    }
                    else{
                        System.out.println("Dequed element is "+ del);
                    }
                    break;
                case 3:
                    q.printQueue();
                    break;

                case 0:
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Please enter valid key.");
                    break;
            }

        }while(ch!=0);
    }
}
