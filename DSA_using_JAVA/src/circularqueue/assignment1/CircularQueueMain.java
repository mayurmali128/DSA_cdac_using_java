package circularqueue.assignment1;

import queueusingarray.assignment1.IntegerQueue;

import java.util.Scanner;

public class CircularQueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue q = new CircularQueue(10);
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
                    System.out.println("Enter number: ");
                    int number = sc.nextInt();
                    q.enqueue(number);
                    break;
                case 2:
                    int del = q.dequeue();
                    if(del == Integer.MIN_VALUE){
                        System.out.println("Queue is empty.");
                    }
                    else{
                        System.out.println("Dequed element is "+ del);
                    }
                    break;
                case 3:
                    q.printQueue();
                    break;
                default:
                    System.out.println("Please enter valid key.");
                    break;
            }

        }while(ch!=0);
    }
}
