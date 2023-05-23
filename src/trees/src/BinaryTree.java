public class BinaryTree<E> implements TreeJonas {

    private int key;
    private E value;

    private BinaryTree<E> left = null;
    private BinaryTree<E> right = null;

    public BinaryTree(int k, E v) {
        this.key = k;
        this.value = v;
    }

    public int max() {

        int retVal = (int)value;

        if (left != null) {
            if (left.max() > retVal) {
                retVal = left.max();
            }
        }
        if (right != null) {
            if (right.max() > retVal) {
                retVal = right.max();
            }
        }
        return retVal;
    }

    @Override
    public int getKey() {
        return key;
    }

    @Override
    public E getValue() {
        return value;
    }

    @Override
    public int height() {
        int heightLeft = -1;
        int heightRight = -1;

        if (left != null) {
            heightLeft = left.height();
        }
        if (right != null) {
            heightRight = right.height();
        }

        return Math.max(heightLeft, heightRight) + 1;
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
    public BinaryTree<E> find(int k) {
        if (key == k) {
            return this;
        }
        if (left != null) {
            BinaryTree<E> leftRes = left.find(k);
            if (leftRes != null) {
                return leftRes;
            }
        }
        if (right != null) {
            BinaryTree<E> rightRes = right.find(k);
            if (rightRes != null) {
                return rightRes;
            }
        }
        return null;
    }

    public void add(BinaryTree<E> child) {

        BinaryTree<E> newChild = child;

        if (left == null) {
            left = newChild;
        } else if (right == null) {
            right = newChild;
        } else {
            left.add(newChild);
        }

    }

    public void preorder() { // as an example, we print the value of the node System.out.println(this.value);
        if (this.left != null) {
            left.preorder();
        }
        if (this.right != null) {
            right.preorder();
        }
    }

    public void postorder () {
        if (this.left != null) {
        left.postorder(); }
        if (this.right != null) {
            right.postorder();
        }
        System.out.println(this.value); }


    public void inorder () {
        if (this.left != null) {
            left.inorder(); }
        // as an example, we print the value of the node
        System.out.println(this.value); if (this.right != null) {
            right.inorder(); }
    }

    public void addChildRight(BinaryTree<E> rightChild) {

        int key = rightChild.getKey();
        E value = rightChild.getValue();

        BinaryTree<E> newChild = new BinaryTree<>(key, value);
        right = newChild;
    }

    public void addChildLeft(BinaryTree<E> leftChild) {

        int key = leftChild.getKey();
        E value = leftChild.getValue();

        BinaryTree<E> newChild = new BinaryTree<>(key, value);
        left = newChild;
    }

}
