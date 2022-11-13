public class Main {
    public static String reverse(String s) {
      MyStack<Character> stack = new MyStack<Character>();
      char[] a = s.toCharArray();
      int i;
      for (i=0;i<a.length;i++) {
        stack.push(a[i]);
      }
      char[] sb = new char[a.length+1];
      for(i=0;i<a.length;i++) {
        sb[i] = stack.pop();
      }
      return String.valueOf(sb);
    }
    public static void main(String[] args) {
      System.out.println(reverse("Hello World!"));
    }
  }