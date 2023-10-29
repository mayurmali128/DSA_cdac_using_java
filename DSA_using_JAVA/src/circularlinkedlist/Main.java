package circularlinkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList l1 = new CircularLinkedList();
//        l1.createLinkedList(3);
//        System.out.println(l1);
//        System.out.println("Size: "+l1.getSize());
////        l1.insertAtStart(10);
////        System.out.println(l1);
//        l1.deleteBeg();
//        l1.deleteEnd();
//        System.out.println(l1);

        Scanner sc = new Scanner(System.in);
        int ch = 0;

        do{
            System.out.println("1.Create circular list of n numbers.");
            System.out.println("2.Insert at end.");
            System.out.println("3.Insert at beggining.");
            System.out.println("4.Insert at specific position.");
            System.out.println("5.Delete from end");
            System.out.println("6.Delete from start");
            System.out.println("7.Delete at specific position.");
            System.out.println("8.Print the linked list.");
            System.out.println("0.exit");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Enter number of nodes:");
                    l1.createLinkedList(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter data: ");
                    l1.insertAtEnd(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Enter data: ");
                    l1.insertAtStart(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Enter position and data to insert: ");
                    l1.insertAtPos(sc.nextInt(),sc.nextInt());
                    break;
                case 5:
                    l1.deleteEnd();
                    System.out.println("Deleted from end.");
                    break;
                case 6:
                    l1.deleteBeg();
                    System.out.println("Deeted from start.");
                    break;
                case 7:
                    System.out.println("Enter position to delete: ");
                    l1.deletePos(sc.nextInt());
                    break;
                case 8:
                    System.out.println("Linked list: ");
                    System.out.println(l1);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please enter valid choice.");
                    break;
            }
        }while(ch != 0);
    }
}
