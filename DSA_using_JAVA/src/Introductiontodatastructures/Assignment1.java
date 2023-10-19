package Introductiontodatastructures;

public class Assignment1 {
    public  static  boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int start = 2;
        int end = 100;
        int cnt = 0;
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                cnt++;
                System.out.println(i);
            }
        }
        System.out.println("Count: "+ cnt);
    }
}
