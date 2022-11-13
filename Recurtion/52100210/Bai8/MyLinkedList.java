public class MyLinkedList<E> implements ListInterface<E> {
    private Node<E> head;
    private int size;
  
    public boolean isEmpty() {
      return this.size == 0;
    }
  
    public Node<E> getFirst() {
      return this.head;
    }
  
    public void add(E data) {
      if (head == null) {
        head = new Node<E>(data);
        return;
      }
      head = new Node<E>(data, head);
      size++;
    }
  
    public Node<E> getByIndex(int index) {
      if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException();
      }
      Node<E> curr = head;
      for (int i = 0; i < index; i++) {
        curr = curr.getNext();
      }
      return curr;
    }
  
    public void print() {
      if (head == null) {
        return;
      }
      Node<E> current = head;
      while (current != null) {
        System.out.print(current.getData() + " ");
        current = current.getNext();
      }
    }
  
    public void addSortedList(E item, Node<E> curr) {
      Node<E> newNode = new Node<E>(item);
      if (curr == null) {
        return;
      }
      // th1 node
      if (isEmpty()) {
        head = newNode;
        return;
      }
      // th nhieu node va node moi nho hon node dau tien
      if (newNode.compareTo(curr) >= 0) {
        if (curr.compareTo(head) == 0) {
          newNode.setNext(head);
          head = newNode;
          return;
        }
        // th tong quat
        newNode.setNext(curr.getNext());
        curr.setNext(newNode);
        return;
      }
      // th node cuoi
      if (curr.getNext() == null) {
        curr.setNext(newNode);
        return;
      }
  
      addSortedList(item, curr.getNext());
  
    }
  
    public void addSortedList2(E item, Node<E> curr) {
      Node<E> newNode = new Node<E>(item);
      int l = 0;
      int r = size - 1;
      while (l <= r) {
        int m = (l + r) / 2;
        Node<E> mid = getByIndex(m);
        if (mid.compareTo(newNode) == 0) {
          if (mid.getNext() == null) {
            mid.setNext(newNode);
            return;
          }
          newNode.setNext(mid.getNext());
          mid.setNext(newNode);
          return;
        }
        if (mid.compareTo(newNode) > 0) {
          r = m - 1;
        } else {
          l = m + 1;
        }
      }
    }
  
    public int countEven(Node<E> curr) {
      if (curr == null) {
        return 0;
      }
      return (int) curr.getData() % 2 == 0 ? 1 + countEven(curr.getNext()) : countEven(curr.getNext());
    }
  
    public int sumLinkedList(Node<E> curr) {
      if (curr == null) {
        return 0;
      }
      return (int) curr.getData() + sumLinkedList(curr.getNext());
    }
  
  }