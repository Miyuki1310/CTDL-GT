public class Node<E> {
    private E data;
    private Node<E> next;
  
    public Node() {
      this.data = null;
      this.next = null;
    }
  
    public Node(E data) {
      this.data = data;
      this.next = null;
    }
  
    public Node(E data, Node<E> next) {
      this.data = data;
      this.next = next;
    }
  
    public E getData() {
      return data;
    }
  
    public void setData(E data) {
      this.data = data;
    }
  
    public Node<E> getNext() {
      return next;
    }
  
    public void setNext(Node<E> next) {
      this.next = next;
    }
  
    @SuppressWarnings("unchecked")
    public int compareTo(Node<E> node) {
      return ((Comparable<E>) this.data).compareTo(node.data);
    }
  
    @Override
    public String toString() {
      return data + " ";
    }
  }