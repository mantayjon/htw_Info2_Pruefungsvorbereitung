public class BinarySearch {
    public static void main(String[] args) {

        int[] toSearch = {-10,-9,-8,-7,-6,-5,0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};


        binarySort(toSearch, -11, 0, toSearch.length - 1, toSearch.length / 2);

    }

    public static int binarySort(int[] arr, int toFind, int low, int high, int mid) {
        mid = (low + high) / 2;

        if (low > high) {
            System.out.println("Nummer gibts nicht, Dikka");
            return -1;

        } else if (toFind > arr[mid] && toFind < arr[arr.length - 1]) {
            low = mid + 1;
            binarySort(arr, toFind, low, high, mid);

        } else if (toFind < arr[mid]) {
            high = mid - 1;
            binarySort(arr, toFind, low, high, mid);

        } else if (toFind == arr[mid]) {
            System.out.println(mid);
            return mid;

        }
        return mid;
    }

}