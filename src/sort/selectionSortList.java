import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class selectionSortList {

    public static void main(String[] args) {
        List<Integer> toSort = new ArrayList<>();
        toSort = Arrays.asList(0, 221,1324,0,1231,321,12,54,12,73,21,57,84,0,2,5,2,7,5);

        System.out.print("Before = ");
        System.out.println(toSort);
        System.out.print("");

        selectionSort(toSort);

        System.out.print("After =  ");
        System.out.println(toSort);
    }

    public static void selectionSort(List<Integer> arrayList){
        int placeholder = 0;

        for (int station = 0; station < arrayList.size() ;station++){
            for (int searcher = station+1; searcher <  arrayList.size()-1; searcher++){
                if(arrayList.get(searcher) <= arrayList.get(placeholder)){
                    placeholder = searcher;
                }
            }
            swap(placeholder, station, arrayList);
        }

    }

    public static void swap(int placeholder, int station, List<Integer> arrayList){
        int storeValue = arrayList.get(station);
        arrayList.set(station, arrayList.get(placeholder));
        arrayList.set(placeholder, storeValue);
    }
}
