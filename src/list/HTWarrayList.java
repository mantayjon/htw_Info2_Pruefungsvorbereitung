public class HTWarrayList<E> implements arrayListInterface<E> {
    private int capacity = 10;
    private E[] data = (E[]) (new Object[capacity]);
    private int size = 0;

    public void main(String[] arg) {

    }

    @Override
    public void add(E obj) {

        if (size == data.length) {
            capacity = 2 * capacity;
            E[] dataNew = (E[]) new Object[capacity];
            System.arraycopy(data, 0, dataNew, 0, data.length);
            data = dataNew;
        }
        data[size] = obj;
        size++;

    }

    @Override
    public E get(int i) {

        if (i > data.length || i < 0) {
            //return null;
            throw new IndexOutOfBoundsException();
        }
        E n = data[i];
        return n;
    }

    @Override
    public void remove(int i) {
        if (i > data.length || i < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            E[] dataNew = (E[]) new Object[capacity - 1];
            System.arraycopy(data, 0, dataNew, 0, i);
            System.arraycopy(data, i + 1, dataNew, i, data.length - i - 1);
            data = dataNew;
            size--;
            capacity--;
        }

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
}
