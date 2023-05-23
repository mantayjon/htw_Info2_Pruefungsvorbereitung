public class SinglyLinkedHTW<E> implements arrayListInterface {


    private SinglyLinkedNode<E> head = null;

    public void addIndex(int i, E obj) {
        int n = 0;
        SinglyLinkedNode<E> add = new SinglyLinkedNode<>();
        SinglyLinkedNode<E> pointer = head;


        if (pointer == null && i == 0) {
            pointer.value = obj;
            head = pointer;
        }

        while (pointer.next != null) {
            if (n + 1 == i) {
                add.next = pointer.next;
                add.value = obj;
                pointer.next = add;
                return;
            }
            pointer = pointer.next;
            n++;
        }


        /*

        while (pointer.next != null) {
            if (n == i-1) {
                SinglyLinkedNode<E> nextNode = pointer.next;
                add = pointer;

                add.next = nextNode;
                return;
            }
            n++;
        }

        */

        throw new IndexOutOfBoundsException();
    }

    @Override
    public void add(Object obj) { // add an element at the end of the list

        SinglyLinkedNode<E> n = new SinglyLinkedNode<>();
        n.value = (E) obj;
        n.next = null;

        // if list is empty, we need to set "head" to the new node
        if (head == null) {
            head = n;
            return;
        }
        SinglyLinkedNode<E> cursor = head;
        while (cursor.next != null) {
            cursor = cursor.next;
        }
        // after the iteration, cursor points to the last element before extending
        cursor.next = n;
    }

    @Override
    public Object get(int i) {
        int n = 0;
        SinglyLinkedNode<E> pointer = head;

        while (n < i) {
            pointer = pointer.next;
            n++;
        }
        return pointer.value;
    }

    @Override
    public void remove(int i) {
        int itr = 0;

        SinglyLinkedNode<E> pointer = head;

        if (i == 0) {
            head = head.next;
            return;
        }

        while (pointer != null) {
            if (itr == i - 1) {
                SinglyLinkedNode<E> toRemove = new SinglyLinkedNode<>();
                pointer.next = pointer.next.next;
            }
            pointer = pointer.next;
            itr++;
        }


    }

    @Override
    public int size() {
        int i = 0;
        SinglyLinkedNode<E> pointer = head;
        while (pointer != null) {
            pointer = pointer.next;
            i++;
        }
        return i;
    }

    @Override
    public boolean isEmpty() {

        if (head == null) {
            return true;
        } else {
            return false;
        }
    }
}
