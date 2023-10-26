package linkedlist.assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringLinkedList sl = new StringLinkedList();
        Scanner sc = new Scanner(System.in);
        int ch=0;

        do{
            System.out.println("\n 1.Add at end.");
            System.out.println("2.Add at beggining..");
            System.out.println("3.Print first node..");
            System.out.println("4.Print last node.");
            System.out.println("5.Get size of Linked List.");
            System.out.println("6.Modify String (by searching string)");
            System.out.println("7.Modify String (by position)");
            System.out.println("8.Display");
            System.out.println("9. Enter 5 strings to create linked list.");
            System.out.println("0.Exit");
            System.out.println("Enter your choise.");
            ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Enter a string: ");
                    sc.nextLine();
                    String str1 = sc.nextLine();
                    sl.addAtEnd(str1);
                    break;
                case 2:
                    System.out.println("Enter a string: ");
                    sc.nextLine();
                    String str2 = sc.nextLine();
                    sl.addAtBeg(str2);
                    break;
                case 3:
                    System.out.println("First node :");
                    sl.printFirstNode();
                    break;
                case 4:
                    System.out.println("last node :");
                    sl.printLastNode();
                    break;
                case 5:
                    System.out.println("Size of linked list is: "+ sl.getsize());
                    break;
                case 6:
                    System.out.println("Enter string where to replace: ");
                    sc.nextLine();
                    String str3 = sc.nextLine();
                    System.out.println("Enter string to replace: ");
                    String str4 =  sc.nextLine();
                    sl.modify(str3,str4);
                    break;
                case 7:
                    System.out.println("Enter position to replace:");
                    int pos1 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter String: ");
                    String str5 = sc.nextLine();
                    sl.modify(pos1,str5);
                    break;
                case 8:
                    System.out.println("Printing Linked list: ");
                    sl.printLinkedList();
                    break;
                case 9:
                    String []arr = new String[5];
                    sc.nextLine();
                    for (int i=0; i<5; i++){
                        System.out.print("Enter "+ (i+1)+"String: ");
                        arr[i] = sc.nextLine();
                    }
                    sl.createLinkedList(arr);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Please enter valid key.");
                    break;
            }
        }while(ch !=0);
    }
}
