package Introductiontodatastructures;

import java.util.Scanner;

public class Assignment5 {
    public static boolean isPerfect(int n){
        int sum = 0;

        for(int i=1; i<n; i++){
            if(n%i==0){
                sum += i;
            }
        }
        return sum==n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check perfect or not: ");
        int number = sc.nextInt();

        if(isPerfect(number)){
            System.out.println("Number is perfect.");
        }
        else{
            System.out.println("Number is not perfect.");
        }
    }
}
