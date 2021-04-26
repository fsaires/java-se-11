package chapter01;

public class Exercise26 {

  public static void main(String[] args) {
    var sb = new StringBuilder();
    sb.append("red");
    sb.deleteCharAt(0);
    sb.delete(1, 2);
    System.out.println(sb);
  }
}
