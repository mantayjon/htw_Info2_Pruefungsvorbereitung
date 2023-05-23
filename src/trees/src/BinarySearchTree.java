public class BinarySearchTree<E> implements TreeJonas<E> {
    private int key;
    private E value;
    private BinarySearchTree<E> left;
    private BinarySearchTree<E> right;

    public BinarySearchTree(int k, E v) {
        this.key = k;
        this.value = v;
    }

    @Override
    public E getValue() {
        return value;
    }

    @Override
    public int height() {
        return 0;
    }

    public void add(int k, E v) {
        BinarySearchTree<E> newTree = new BinarySearchTree<>(k, v);
        if (this.key == k) {
            return;
        } else if (this.key > k) {
            if (left == null) {
                left = newTree;
            } else {
                left.add(k, v);
            }
        } else {
            if (right == null) {
                right = newTree;
            } else {
                right.add(k, v);
            }
        }
    }

    public void addNode(BinarySearchTree<E> newTree) {
        int k = newTree.getKey();
        E v = newTree.value;

        if (this.key == k) {
            return;
        }
        if (key > k) {
            if (left == null) {
                left = newTree;
            } else {
                left.addNode(newTree);
            }
        } else if (key < k) {
            if (right == null) {
                right = newTree;
            } else {
                right.addNode(newTree);
            }

        }
    }


    @Override
    public int getKey() {
        return key;
    }


    @Override
    public int size() {
        int sLeft = 0;
        int sRight = 0;

        if (left != null) {
            sLeft = left.size();
        }
        if (right != null) {
            sRight = right.size();
        }
        return sLeft + sRight + 1;
    }

    @Override
    public TreeJonas<E> find(int k) {
        if (this.key == k) {
            return this;
        } else if (this.key > k) {
            if (this.left == null) {
                return null;
            }
            return this.left.find(k);
        } else {
            if (this.right == null) {
                return null;
            }
            return this.right.find(k);
        }
    }

}