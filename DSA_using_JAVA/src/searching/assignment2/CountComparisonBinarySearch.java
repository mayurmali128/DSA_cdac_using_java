package searching.assignment2;

import java.util.Scanner;

public class CountComparisonBinarySearch {

    public static int BinarySearchCount(int[]arr, int key){
        int start = 0;
        int end = arr.length-1;
        int res = 0;

        boolean notFound = true;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                notFound = false;
                System.out.println("Element found at index: "+ mid);
                break;
            }
            else if(arr[mid]>key){
                res++;
                end = mid -1;
            }
            else{
                res++;
                start = mid +1;
            }
        }

        if(notFound){
            System.out.println("Element not found.");
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Enter 10 sorted elements: ");
        Scanner sc = new Scanner(System.in);
        int []arr = new int[10];

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter key to find: ");
        int key = sc.nextInt();
        System.out.println("No of comparisons requires to search key is: "+ BinarySearchCount(arr,key));
    }
}
