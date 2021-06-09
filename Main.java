import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println(compare("abc#d", "abzz##d"));
  }

  public static boolean compare(String a, String b) {
    return helper(a).equals(helper(b));
  }

  public static String helper(String s) {
    Stack<Character> res = new Stack();

    for (char c : s.toCharArray()) {
      if (c != '#') {
        res.push(c);
      } else if (!res.empty()) {
        res.pop();
      }
    }

    return String.valueOf(res);
  }
}