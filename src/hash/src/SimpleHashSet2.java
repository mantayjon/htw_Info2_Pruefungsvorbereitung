import java.util.LinkedList;
import java.util.List;

public class SimpleHashSet2<E> {
    int cap = 5; // capacity
    private List<E>[] data;
    List<E> bucket;

    public SimpleHashSet2() {
        data = new LinkedList[cap];
        for (int i = 0; i < cap; i++) {
            data[i] = new LinkedList<>();
        }
    }

    public void remove(E elem) {
        int index = Math.abs(elem.hashCode() % cap);
        bucket = data[index];
        for(E e : bucket){
            if(e == elem){
                bucket.remove(e);
            }
        }
    }


    public void add(E elem) {
        int index = Math.abs(elem.hashCode() % cap);
        bucket = data[index];
        if (!bucket.contains(elem)) {
            bucket.add(elem);
        }
    }

    public boolean contains(E elem) {
        int index = Math.abs(elem.hashCode() % cap);
        bucket = data[index];
        return bucket.contains(elem);
    }
}
