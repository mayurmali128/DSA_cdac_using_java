package array;

import java.util.Scanner;

public class Assignment1 {

    public static void getArray(int []arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter "+ arr.length+ " elements.");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void printArray(int []arr){
        for(int i:arr){
            System.out.print(i + " ");
        }
    }

    public static int numberOfCommonElements(int []arr1, int []arr2){
        int cnt = 0;
        for(int i:arr1){
            for(int j:arr2){
                if(i==j){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static int[] intersect(int []arr1, int []arr2){
        int cnt = numberOfCommonElements(arr1,arr2);

        int[] res = new int[cnt];
        int k =0;
        for(int i:arr1){
            for(int j:arr2){
                if(i==j){
                    res[k++] = i;
                }
            }
        }
        return res;
    }

    public static int[] union(int []arr1, int []arr2){
        int cnt = numberOfCommonElements(arr1,arr2);

        int[] res = new int[arr1.length+arr2.length-cnt];

        int[] common = intersect(arr1,arr2);
        int k =0;
        for(int i: arr1){
            res[k++] = i;
        }

        for(int i:arr2){
            boolean flag = true;
            for(int j:common){
                if(i==j){
                    flag = false;
                }
            }
            if(flag){
                res[k++] = i;
            }
        }
        return res;
    }

    public static int countEvenNumbers(int[]arr){
        int cnt = 0;
        for(int i:arr){
            if((i&1) ==0){
                cnt++;
                break;
            }
        }
        return cnt;
    }

    public static int countOddNumbers(int[]arr){
        int cnt = 0;
        for(int i:arr){
            if((i&1) ==1){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr1;
        int []arr2;
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        arr1 = new int[size];
        arr2 = new int[size];


        getArray(arr1);
        System.out.println("\n Arr1: ");
        printArray(arr1);

        getArray(arr2);
        System.out.println("\n Arr2: ");
        printArray(arr2);

        System.out.println("\n Number of common element is: "+ numberOfCommonElements(arr1,arr2));
        System.out.println("\n Intersection of both arrays:");
        //printing intersection of two arrays
        printArray(intersect(arr1,arr2));

        System.out.println("\n Union of both arrays:");
        //printing intersection of two arrays
        printArray(union(arr1,arr2));
        sc.close();

        System.out.println("Number of even numbers in arr1: "+ countEvenNumbers(arr1));
        System.out.println("Number of even numbers in arr2: "+ countEvenNumbers(arr2));

        System.out.println("Number of odd numbers in arr1: "+ countOddNumbers(arr1));
        System.out.println("Number of odd numbers in arr2: "+ countOddNumbers(arr2));

    }
}
