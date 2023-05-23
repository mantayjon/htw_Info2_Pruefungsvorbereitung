package list;

public class SinglyTest{

    public static void main(String[] args) {

        SinglyLinkedHTW<Integer> list = new SinglyLinkedHTW<>();


        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);

        list.addIndex(2,3);


        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println("");

        list.remove(0);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));


    }

}