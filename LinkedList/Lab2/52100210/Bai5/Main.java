public class Main {
  public static void main(String[] args) {
    MyQueue<Integer> queue = new MyQueue<Integer>();
    queue.enQueue(1);
    queue.enQueue(2);
    queue.enQueue(3);
    queue.enQueue(4);
    queue.enQueue(5);

    queue.print();
    System.out.println(queue.poll());
    queue.print();
    System.out.println(queue.peek());
    queue.print();
    System.out.println("Empty:"+queue.isEmpty());
  }
}