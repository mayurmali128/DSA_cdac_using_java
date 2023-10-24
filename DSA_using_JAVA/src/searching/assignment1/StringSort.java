package searching.assignment1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringSort {
    public static void sortStr(String [] arr){
        for (int i=0; i<arr.length-1; i++){
            for(int j=0; j< arr.length-1-i; j++){
                if(arr[j].compareTo(arr[j+1]) > 1){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String []strs = new String[10];
        System.out.println("Enter 10 string to sort: ");

        for(int i=0; i<10; i++){
            System.out.print("Enter string"+(i+1)+ " :");
            strs[i] = bf.readLine();
        }
        System.out.println("Before sorting:");
        for(int i=0; i<10; i++){
            System.out.println(strs[i]);
        }

        sortStr(strs);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("After sorting:");
        for(int i=0; i<10; i++){
            System.out.println(strs[i]);
        }
        bf.close();
    }
}
