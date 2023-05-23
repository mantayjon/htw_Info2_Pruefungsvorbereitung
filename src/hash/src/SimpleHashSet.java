public class SimpleHashSet<E> {
    int cap = Integer.MAX_VALUE; // capacity
    private E[] data;

    public SimpleHashSet() {
        data = (E[]) (new Object[cap]);
    }

    public void add(E elem) {
        data[elem.hashCode()] = elem;
    }

    public boolean contains(E elem) {
        return data[elem.hashCode()] != null;
    }
}