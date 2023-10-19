package Introductiontodatastructures;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();
        int number1 = 0;
        int number2 = 1;

        for(int i=0; i<terms; i++){
            System.out.print(number1+ " ");
            int temp = number1;
            number1 = number2;
            number2 += temp;
        }
    }
}
