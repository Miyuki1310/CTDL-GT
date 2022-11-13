import java.util.NoSuchElementException;

public interface  LinkedListInterface<E> {
    public void addFirst(E item);
    public void addLast(E item);
    public void addAfter(E item, Node<E> prev);
    public E removeFirst() throws NoSuchElementException;
    public E removeLast() throws NoSuchElementException;
    public E removeAfter(Node<E> curr);
    public void print();
    public boolean isEmpty();
    public E getFirst();
    public Node<E> getHead();
    public int size();
    public boolean contains(E item);
    public E removeCurr(Node<E> curr);
}
