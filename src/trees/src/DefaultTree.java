import java.util.LinkedList;
import java.util.List;

public class DefaultTree<E> implements TreeJonas<E> {

    private int key; // index
    private E value;
    private List<DefaultTree<E>> children;

    public DefaultTree(int k, E v) {
        this.key = k;
        this.value = v;
        this.children = new LinkedList<>();
    }

    public E getValue() {
        return value;
    }

    @Override
    public int height() {
        // first, get the maximum height of all children
        int res = -1;
        for (DefaultTree<E> child : children) {
            int h = child.height();
            if (res < h) {
                res = h;
            }
        }
        return res + 1;
    }

    @Override
    public int size() {
        int sum = 1; // Start with the size of the current node
        for (DefaultTree<E> child : children) {
            sum += child.size();
        }
        return sum;
    }


    @Override
    public TreeJonas<E> find(int k) {
        if (this.key == k) {
            return this;
        }
        for (DefaultTree<E> child : children) {
            TreeJonas<E> res = child.find(k);
            if (res != null) {
                return res;
            }
        }
        return null;
    }

    public int getKey() {

        return key;
    }

    public void addChild(DefaultTree<E> child) {
        children.add(child);
    }

}