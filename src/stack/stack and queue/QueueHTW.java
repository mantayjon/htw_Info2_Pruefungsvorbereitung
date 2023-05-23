public class QueueHTW implements queueInterface{

    SinglyLinkedHTW<Integer> qu = new SinglyLinkedHTW<>();
    @Override
    public void enqueue(Object o) {
        qu.add(o);

    }

    @Override
    public Object dequeue() {

        Object obj = qu.get(0);
        qu.remove(0);
        return obj;
    }

    @Override
    public Object first() {
        if(qu.size() == 0){
            return null;
        }else {
            Object obj = qu.get(0);
            return obj;
        }
    }

    @Override
    public int size() {
        int s = qu.size();
        return s;
    }

    @Override
    public boolean isEmpty() {
        return qu.isEmpty();
    }
}

