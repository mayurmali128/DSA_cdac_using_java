package operationsonlinkedlist.assignment1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyLinkedList l1 = new MyLinkedList();
        Scanner sc = new Scanner(System.in);
        int ch = 0;

        do{

            System.out.println("1.Create linked list of n element. ");
            System.out.println("2 Print list ");
            System.out.println("3.Print mid.");
            System.out.println("4.Insert at end.");
            System.out.println("5. Print reverse linked list.");
//            System.out.println("6. Insert data after value.");
            System.out.println("6. Add data at specific position");
            System.out.println("7. Delete data at specific posiyion.");
            System.out.println("0. exit.");
            System.out.println("Enter your choise: ");
            ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Enter elemets to insert: ");
                    int n = sc.nextInt();
                    l1.createLinkedList(n);
                    break;
                case 2:
                    System.out.println("Given linked list:");
                    l1.printLinkedList();
                    break;
                case 3:
                    l1.printMid();
                    break;
                case 4:
                    System.out.println("Enter element to insert at end.");
                    l1.insertAtEnd(sc.nextInt());
                    break;
                case 5:
                    System.out.println("Reverse linked list: ");
                    l1.printReverse(l1.head);
                    break;
                case 6:
                    System.out.println("Enter value to insert position and value to be inserted: ");
                    l1.insertNodeAtPos(sc.nextInt(), sc.nextInt());
                    break;

                case 7:
                    System.out.println("Enter position to delete: ");
                    l1.delete(sc.nextInt());
                    break;

                default:
                    System.out.println("Please enter valid key.");
                    break;
            }

        }while (ch != 0);
    }
}
