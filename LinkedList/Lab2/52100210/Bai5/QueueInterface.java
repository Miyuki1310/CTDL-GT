interface QueueInterface<E> {
    public boolean isEmpty();
    public E peek();
    public E poll();
    public void enQueue(E o);
  }