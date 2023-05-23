public class insertionSortNew {


    public static void main(String[] args) {

        int[] array = {1, 765, 3, 345, 7, 9865, 32, -13, 34, -67, 0};
        printBefore(array);
        sort(array);
        printAfter(array);

    }

    public static void sort(int[] array) {

        for (int king = 1; king < array.length; king++) {
            int queen = king;

            while ( (queen > 0) && ( array [queen] < array[queen-1] ) ) {
                swap(queen, queen-1, array);
                queen--;
            }
        }

    }
    public static void swap(int queen, int king, int[] arr) {

        int stored = arr[queen];
        arr[queen] = arr[king];
        arr[king] = stored;

    }

    public static void printBefore(int[] arr) {
        String s = "";
        System.out.println("Before Sorting:");
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i] + ", ";
        }
        System.out.println(s);
        System.out.println("__________________");
    }

    public static void printAfter(int[] arr) {
        String s = "";
        System.out.println("After Sorting:");

        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i] + ", ";
        }
        System.out.println(s);
        System.out.println("__________________");
    }
}
