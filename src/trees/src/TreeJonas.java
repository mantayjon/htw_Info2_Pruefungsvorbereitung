public interface TreeJonas<E>{
    // all methods in an interface are public perdefault
    int getKey(); // index
    E getValue();
    int height();
    int size();

    TreeJonas<E> find(int k); // find the subtree with givenkey

}
