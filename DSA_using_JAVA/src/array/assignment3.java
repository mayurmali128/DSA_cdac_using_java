package array;

import java.util.Scanner;

public class assignment3 {

    public static void reverse(int start, int end, int[]arr){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateLeft(int[]arr, int k){
        reverse(0,arr.length-1,arr);

        int start = 0;
        int end = arr.length-k-1;
        reverse(start,end,arr);

    }

    public static void rotateRight(int[]arr, int k){
        reverse(0,arr.length-1,arr);

        reverse(0,k-1,arr);
        reverse(k,arr.length-1,arr);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the array: ");
        int size = sc.nextInt();

        int []arr1 = new int[size];

        Assignment1.getArray(arr1);
        System.out.println("Giver array: ");
        Assignment1.printArray(arr1);

        System.out.println("Enter k value to rotate:");
        int k = sc.nextInt();
//        System.out.println("Array after " + k + "th rotation in left: ");
//        rotateLeft(arr1,k);

        System.out.println("Array after " + k + "th rotation in right: ");
        rotateRight(arr1,k);
        Assignment1.printArray(arr1);

    }
}
