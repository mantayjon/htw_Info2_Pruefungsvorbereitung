public class ListTest {
    public static void main(String[] args) {
        HTWarrayList<Integer> list = new HTWarrayList<>();
        list.add(30);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(2);

        list.remove(100);

        printArray(list);
        System.out.println("");
        System.out.println( list.size());


        System.out.println(list.isEmpty());
        System.out.println();

    }

    public static void printArray(HTWarrayList<Integer> list){

        String S = "array2 = ";

        for(int i = 0;i < list.size() ;i++){
            S = S + list.get(i) + ", ";
        }
        System.out.print(S);
    }
}
