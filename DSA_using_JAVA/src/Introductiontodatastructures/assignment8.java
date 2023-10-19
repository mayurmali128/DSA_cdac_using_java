package Introductiontodatastructures;

public class assignment8 {
    public static int[] mergeArray(int []arr1, int []arr2){
        int []res = new int[arr1.length+arr2.length];
        int k =0;

        for(int i=0; i<arr1.length; i++){
            res[k] = arr1[i];
            k++;
        }

        for(int i=0; i<arr2.length; i++){
            res[k] = arr2[i];
            k++;
        }

        return res;
    }
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4};
        int []arr2 = {5,6,7,8,9,10};

        int []res = mergeArray(arr1,arr2);

        System.out.println("Array after merging: ");

        for(int i:res){
            System.out.print(i+ " ");
        }
    }
}
