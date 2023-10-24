package circularqueue.assignment3;

import circularqueue.assignment1.CircularQueue;

import java.util.Scanner;

public class BookQueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookQueue q = new BookQueue(3);
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
                    System.out.println("Enter bookid: ");
                    int id = sc.nextInt();
                    System.out.println("Enter book name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    Book b = new Book(id,name);
                    q.enqueue(b);
                    break;
                case 2:
                    Book del = q.dequeue();
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
                default:
                    System.out.println("Please enter valid key.");
                    break;
            }

        }while(ch!=0);
    }
}
