public class MyQueue<E> implements QueueInterface<E> {
    MyStack<E> temp = new MyStack<E>();
    MyStack<E> stack = new MyStack<E>();
  
    @Override
    public boolean isEmpty() {
      return stack.isEmpty();
    }
  
    @Override
    public E peek() {
      if (isEmpty()) {
        return null;
      }
      while (!stack.isEmpty()) {
        temp.push(stack.pop());
      }
      E result = temp.getPeek();
      while (!temp.isEmpty()) {
        stack.push(temp.pop());
      }
      return result;
    }
  
    @Override
    public E poll() {
      if (isEmpty()) {
        return null;
      }
      while (!stack.isEmpty()) {
        temp.push(stack.pop());
      }
      E result = temp.pop();
      return result;
    }
  
    @Override
    public void enQueue(E o) {
  
      while (!temp.isEmpty()) {
        stack.push(temp.pop());
      }
      stack.push(o);
    }
  
    public void print() {
      while (!stack.isEmpty()) {
        temp.push(stack.pop());
      }
      while (!temp.isEmpty()) {
        System.out.print(temp.getPeek() + " ");
        stack.push(temp.pop());
      }
      System.out.println();
    }
  
  }