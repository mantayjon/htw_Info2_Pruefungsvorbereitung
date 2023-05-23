import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {

    public static void main(String[] arg) {

        int[] arr1 = {9, 7, 5, 3, 1};
        int[] arr2 = {8, 6, 4, 2, 0};
        int[] toSort = {8,29,3,65,2,0,2,5,4,123,6};
        int[] merged = new int[arr1.length + arr2.length];
        mergeArrays(arr1, arr2, merged);
        splitArr(merged);
    }

    public static int[] splitArr(int[] arr) {

        if (arr.length > 1) {
            int[] left = Arrays.copyOfRange(arr,0,arr.length /2);
            int[] right = Arrays.copyOfRange(arr,(arr.length /2), arr.length);
            left = splitArr(left);
            right = splitArr(right);
            arr = merge(left, right);
            printArray(arr);
        }
        return arr;
    }

    public static int[] merge(int[] left, int[] right) {
        int[] sortedArr = new int[left.length + right.length];
        int l = 0;
        int r = 0;
        int s = 0;

        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                sortedArr[s] = left[l];
                s++;
                l++;
            } else if (left[l] > right[r]) {
                sortedArr[s] = right[r];
                r++;
                s++;
            }
        }
        while (l < left.length){
            sortedArr[s] = left[l];
            s++;
            l++;
        }
        while (r < right.length){
            sortedArr[s] = right[r];
            s++;
            r++;
        }
        return sortedArr;
    }


    public static void printArray(int[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i] + ", ";
        }
        System.out.println(s);
    }

    public static void mergeArrays(int[] arr1, int[] arr2, int[] merged) {
        int n = 0;
        //merging two arrays int one
        for (int i = 0; i < arr1.length; i++) {
            merged[n] = arr1[i];
            n++;
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[n] = arr2[i];
            n++;
        }
        printArray(merged);
    }

}
