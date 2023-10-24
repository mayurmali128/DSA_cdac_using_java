package Introductiontodatastructures.assignment9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of database ");
        int size = sc.nextInt();

        Book [] bookarray = new Book[size];
        int ch = 0;
        int noOfRecords = 0;
        do {
            System.out.println("\n \t Enter your choice:");
            System.out.println("\t 1. Insert");
            System.out.println("\t 2. Display All");
            System.out.println("\t 3. Modify");
            System.out.println("\t 4. Search");
            System.out.println("\t 5. Delete");
            System.out.println("\t 0. Exit");

            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch){
                case 1 :
                    System.out.println("Enter bookid:");
                    int bookid = sc.nextInt();
                    System.out.println("Enter bookname:");
                    sc.nextLine();
                    String bookname = sc.nextLine();
                    System.out.println("Enter price: ");
                    double price = sc.nextDouble();
                    bookarray[noOfRecords++] = new Book(bookid,bookname,price);
                    System.out.println("Record added sucessfully.");
                    break;
                case 2 :
                    System.out.println("Displaying all records: ");
                    for(int i=0; i<noOfRecords; i++){
                        System.out.println(bookarray[i]);
                    }
                    break;
                case 3 :
                    System.out.println("Enter book id to modify: ");
                    int id = sc.nextInt();
                    boolean notfound = true;
                    for(int i=0; i<noOfRecords; i++){
                        if(bookarray[i].getBookId()==id){
                            notfound = false;
                            System.out.println("Enter Data to update");
                            System.out.println("Enter bookid:");
                            int bookid1 = sc.nextInt();
                            System.out.println("Enter bookname:");
                            sc.nextLine();
                            String bookname1 = sc.nextLine();
                            System.out.println("Enter price: ");
                            double price1 = sc.nextDouble();
                            bookarray[i].setData(bookid1,bookname1,price1);
                            System.out.println("Record updated successfully.");

                        }
                    }
                    if(notfound){
                        System.out.println("Id not found!");
                    }
                    break;
                case 4 :
                    System.out.println("Please enter book id to search: ");
                    int id2 = sc.nextInt();
                    boolean notfound1 = true;

                    for (int i=0; i<noOfRecords; i++){
                        if(bookarray[i].getBookId()==id2){
                            notfound1 = false;
                            System.out.println("Record fount.");
                            System.out.println(bookarray[i]);
                        }
                    }
                    if(notfound1){
                        System.out.println("Record not found.");
                    }
                    break;
                case 5 :
                    System.out.println("Enter bookid to delete the record:");
                    int id3 = sc.nextInt();
                    boolean notfound3 = true;
                    for(int i=0; i<noOfRecords; i++){
                        if(bookarray[i].getBookId()==id3){
                            notfound3 = false;
                            for(int j=i+1; j<noOfRecords; j++){
                                bookarray[j-1].swap(bookarray[j]);
                            }
                            noOfRecords--;
                            System.out.println("Book deleted successfuly");
                        }
                    }
                    if(notfound3){
                        System.out.println("Record not found. Can not delete.");
                    }
                    break;
                default:
                    System.out.println("Please enter valid choise.");
                    break;
            }
        }while(ch!=0);
    }
}
