import java.util.HashMap;

public class Main {

  public static boolean balanced(String s) {
    MyStack<Character> stack = new MyStack<Character>();
    for (Character c : s.toCharArray()) {
      if (c == '{' || c == '(' || c == '[') {
        stack.push(c);
      } 
      else {
        if (stack.isEmpty()) {
          return false;
        } else {
          char top = stack.getPeek();
          if (top == '{' && c == '}' || top == '(' && c == ')' || top == '[' && c == ']') {
            stack.pop();
          } else {
            return false;
          }
        }
      }
    }
    return stack.isEmpty();
  }

  public static boolean balanced_V2(String s) {
    MyStack<Character> stack = new MyStack<Character>();
    HashMap<Character, Character> map = new HashMap<Character, Character>();
    map.put('}', '{');
    map.put(')', '(');
    map.put(']', '[');
    for (Character c : s.toCharArray()) {
      switch (c) {
        case '{':
        case '(':
        case '[':
          stack.push(c);
          break;
        case '}':
        case ')':
        case ']': {
          if (stack.isEmpty() || stack.getPeek() != map.get(c)) {
            return false;
          }
          stack.pop();
          break;
        }
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    System.out.println(balanced("()"));
    System.out.println(balanced("()[]{}"));
    System.out.println(balanced("(]"));
    System.out.println(balanced("([)]"));
    System.out.println(balanced("{[]}"));

    System.out.println(balanced_V2("()"));
    System.out.println(balanced_V2("()[]{}"));
    System.out.println(balanced_V2("(]"));
    System.out.println(balanced_V2("([)]"));
    System.out.println(balanced_V2("{[]}"));
  }

}