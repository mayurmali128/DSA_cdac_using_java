package array;

import java.util.Scanner;

public class Assignmet5 {

    public static int getNonZero(int [][]arr){
        int res =0;

        for(int []a :arr){
            for(int n:a){
                if(n !=0)
                    res++;
            }
        }
        return res;
    }

    public static void printSparseMatrix(int [][]arr){
        int noOfNonZero = getNonZero(arr);

        int [][] res = new int[noOfNonZero+1][3];
        res[0][0] = arr.length;
        res[0][1] = arr[0].length;
        res[0][2] = noOfNonZero;

        int k = 1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] !=0) {
                    res[k][0] = i;
                    res[k][1] = j;
                    res[k][2] = arr[i][j];
                    k++;
                }
            }
        }
        assignment2.print2dArray(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        int [][] arr = new int[rows][cols];
        assignment2.get2dArray(arr);
        System.out.println("Given array: ");
        assignment2.print2dArray(arr);
        System.out.println("Sparse matrix: ");
        printSparseMatrix(arr);

    }
}
