package sorting1;
import array.Assignment1;

import java.util.Scanner;

public class SelectionSort {
    public static void selSort(int []arr){
        for(int i=0; i<arr.length; i++){
            int mini = arr[i];
            int index = i;

            for(int j=i+1; j<arr.length; j++){
                if(mini>arr[j]){
                    mini = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = mini;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array: ");
        int size = sc.nextInt();

        int []arr = new int[size];
        Assignment1.getArray(arr);
        System.out.println("\n Array before sorting-");
        Assignment1.printArray(arr);
        selSort(arr);
        System.out.println("\n Array after sorting-");
        Assignment1.printArray(arr);
    }
}
