public class hash {
    public static void main(String[] args) {
        String s = "ABC";
        int hash = s.hashCode();

        System.out.println(hash);
        System.out.println((31*65+66)*31+67);
    }
}
