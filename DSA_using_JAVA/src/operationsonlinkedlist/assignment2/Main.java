package operationsonlinkedlist.assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SorttedLinkedList1 l1 = new SorttedLinkedList1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        l1.createLinkedList(n);
        System.out.println("Sorted linked list: ");
        l1.printLinkedList();
    }
}
