public class bai8{
    public static void main(String[] args) {
      MyLinkedList<Integer> list = new MyLinkedList<Integer>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.addSortedList(3, list.getFirst());
  
      list.print();
      System.out.println();
      System.out.println("count " + list.countEven(list.getFirst()));
      System.out.println("sum " + list.sumLinkedList(list.getFirst()));
    }
  }