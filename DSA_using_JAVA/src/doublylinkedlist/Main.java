package doublylinkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        MyLinkedList5 l1 = new MyLinkedList5();

        do {
            System.out.println("1.Insert at end.");
            System.out.println("2.Insert at start.");
            System.out.println("3.Create linked list of n prime numbers.");
            System.out.println("4.Print reverse.");
            System.out.println("5.Insert at given position.");
            System.out.println("6.Search element in linked list.");
            System.out.println("7.Delete the given number.");
            System.out.println("8.Display linked list.");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Enter element to insert:");
                    l1.addEnd(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter element to inser:");
                    l1.addStart(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Enter how many prime nubers do you want?");
                    l1.createLinkedListofPrime(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Reverse:");
                    l1.printReverse();
                    break;
                case 5:
                    System.out.println("Enter postion where to add:");
                    int pos = sc.nextInt();
                    System.out.println("Enter data to add: ");
                    l1.insertAtPos(pos,sc.nextInt());
                    break;
                case 6:
                    System.out.println("Enter element to search: ");
                    if(l1.isPresent(sc.nextInt())){
                        System.out.println("Element is present.");
                    }
                    else{
                        System.out.println("Element is not present.");
                    }
                    break;
                case 7:
                    System.out.println("Enter element to delete");
                    l1.delete(sc.nextInt());
                    break;
                case 8:
                    System.out.println("Linked List:"+l1);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please enter valid choice");
                    break;
            }
        }while(ch != 0);
    }
}
