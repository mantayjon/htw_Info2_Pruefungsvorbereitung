public class SimpleHashSetTest {
    public static void main(String[] args) {
        SimpleHashSet2<Integer> h = new SimpleHashSet2<>();

        h.add(3);
        h.add(5);
        h.remove(3);
        System.out.println(h.contains(3));
    }
}
