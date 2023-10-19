package Introductiontodatastructures;

import java.util.Scanner;

public class Assignment4 {

    public static int countDigit(int n){
        int cnt = 0;
        while(n!=0){
            cnt++;
            n /= 10;
        }
        return cnt;
    }
    public static  boolean isArmstrong(int n){

        int sum = 0;
        int temp = n;
        int count = countDigit(n);

        while(temp != 0){
            int mod = temp%10;
            sum += (int)Math.pow(mod,count);
            temp /= 10;
        }

        return n==sum;
    }
    public static void main(String[] args) {

        int cnt = 0;
        for(int i=0; i<=10000; i++){
            if(isArmstrong(i)){
                cnt++;
                System.out.print(i+ " ");
            }
        }
        System.out.println("Count: "+ cnt);
    }
}
