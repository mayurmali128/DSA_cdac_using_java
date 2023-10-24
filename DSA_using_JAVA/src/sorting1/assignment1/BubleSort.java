package sorting1.assignment1;
import array.Assignment1;

import java.util.Scanner;

public class BubleSort {

    public static void bsort(int []arr){
        int totalswapping = 0;
        int lastsortpass = -1;

        for(int i=0; i<arr.length-1; i++){
            int cnt = 0;
            for(int j=0; j< arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    cnt++;
                    totalswapping++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(cnt==0){
                lastsortpass = i;
                break;
            }
            System.out.println("\nAfter pass" + (i+1) + ": ");
            Assignment1.printArray(arr);
        }

        if(lastsortpass==-1){
            lastsortpass = arr.length-1;
        }
        System.out.println("\nNo of pass needed to sort: "+ lastsortpass);
        System.out.println("\n Total swpping: "+ totalswapping);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter size of array: ");

        int size = sc.nextInt();
        int []arr = new int[size];
        Assignment1.getArray(arr);
        System.out.println("Array before sorting: ");
        Assignment1.printArray(arr);
        bsort(arr);
        System.out.println("\nArray after sorting: ");
        Assignment1.printArray(arr);
    }
}
