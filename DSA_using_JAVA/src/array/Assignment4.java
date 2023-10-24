package array;

import java.util.Scanner;

public class Assignment4 {
    public static void transposeMatrix(int [][]arr){
        int [][]res = new int[arr.length][arr[0].length];

        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                res[j][i] = arr[i][j];
            }
        }
        assignment2.print2dArray(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix:");
        int size = sc.nextInt();

        int [][]arr = new int[size][size];

        assignment2.get2dArray(arr);
        System.out.println("Printing given array: ");
        assignment2.print2dArray(arr);

        System.out.println("Transpose of array: ");
        transposeMatrix(arr);

    }
}
