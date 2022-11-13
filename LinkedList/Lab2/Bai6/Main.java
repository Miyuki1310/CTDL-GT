public class Main {
  public static boolean palindrome(String s) {
    MyStack<Character> stack = new MyStack<Character>();
    MyQueue<Character> queue = new MyQueue<Character>();
    char[] a = s.toCharArray();
    int i;
    for (i=0;i<a.length;i++) {
      if (Character.isLetter(a[i])) {
        stack.push(Character.toLowerCase(c));
        queue.enQueue(Character.toLowerCase(c));
      }

    }
    while (!stack.isEmpty()) {
      if (!stack.pop().equals(queue.deQueue())) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(palindrome("A man, a plan, a canal: Panama"));
    System.out.println(palindrome("hello"));
  }

}