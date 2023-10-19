package Introductiontodatastructures;

public class Assignment2 {
    public static void main(String[] args) {
        int cnt = 1;
        int number = 2;
        while(cnt<=10){
            if(Assignment1.isPrime(number)){
                cnt++;
                System.out.println(number);
            }
            number++;
        }
    }
}
