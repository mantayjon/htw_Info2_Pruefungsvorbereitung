public class StackHTW implements stackInterface {
    SinglyLinkedHTW<Integer> st = new SinglyLinkedHTW<>();

    @Override
    public void push(Object obj) {
        st.add(obj);
    }

    @Override
    public Object pop() {

        Object pop = st.get(0);
        st.remove(0);

        return pop;
    }

    @Override
    public Object peek() {

        int s = st.size();
        Object pop = st.get(s-1);

        return pop;
    }

    @Override
    public int size() {
        int s = st.size();
        return s;
    }

    @Override
    public boolean isEmpty() {
        return st.isEmpty();
    }
}