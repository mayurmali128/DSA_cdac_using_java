package array;

import java.util.Scanner;

public class assignment2 {
    public static void get2dArray(int [][]arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Getting input of 2d array");
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter"+ arr[i].length + " Elements: ");
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void print2dArray(int [][]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void AddMatrix(int[][]arr1, int[][]arr2){
        if(arr1.length!=arr2.length || arr1[0].length != arr2[0].length){
            System.out.println("Cannot add differnt size matries.");
            return;
        }
        int [][]res = new int[arr1.length][arr1[0].length];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                res[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Addition of given 2d matrix: ");
        print2dArray(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of 2d array: ");
        int size = sc.nextInt();

        int [][]arr1 = new int[size][size];
        int [][]arr2 = new int[size][size];

        get2dArray(arr1);
        get2dArray(arr2);

        AddMatrix(arr1,arr2);

    }
}
