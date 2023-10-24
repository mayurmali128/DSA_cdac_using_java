package stackusingarray.assignment2;


import stackusingarray.assignment1.MyStack;

import Introductiontodatastructures.Assignment1;

public class PrimeStack {
    public static void main(String[] args) {
        MyStack primestack = new MyStack(10);

        int cnt = 0;
        int number = 2;
        while(cnt<=10){
            if(Assignment1.isPrime(number)){
                cnt++;
                primestack.push(number);
            }
            number++;
        }

        System.out.println("All primes in stack: ");
        primestack.display();
    }
}
