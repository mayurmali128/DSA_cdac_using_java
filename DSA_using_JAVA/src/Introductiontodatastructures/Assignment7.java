package Introductiontodatastructures;

import java.util.Scanner;

public class Assignment7 {
    public static boolean isPalindrome(int n){
        int rev = 0;
        int temp = n;

        while(temp!=0){
            int mod = temp % 10;
            rev = (rev*10)+ mod;
            temp /= 10;
        }

        return rev==n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

        if(isPalindrome(number)){
            System.out.println("The number is palindrome.");
        }
        else{
            System.out.println("Number is not palindrome.");
        }
    }
}
