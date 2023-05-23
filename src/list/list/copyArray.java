package list;

public class copyArray {

    public static void main(String[] args) {

        int arr1[] = {  1, 2, 7, 4, 5 };
        int arr2[] = { 5, 10, 20, 30, 40, 50 };
        int i = 2;

        // copies an array from the specified source array
        //copyIn(arr1, arr2);
        remove(arr1, i);
    }

    public static void copyIn(int[] arr1, int[] arr2){
        System.arraycopy(arr1, 3, arr2, 2, 3);
        print(arr2);
    }

    public static void remove(int[] arr1, int i){
        int[] data = new int[arr1.length-1];
        System.arraycopy(arr1,0, data,0, i);
        System.arraycopy(arr1, i+1, data, i, arr1.length-i-1);
        print(data);
    }

    public static void print(int[] arr) {
        String S = "array = ";

        for (int i = 0; i < arr.length; i++) {
            S = S + arr[i] + ", ";
        }
        System.out.print(S);
    }
}

