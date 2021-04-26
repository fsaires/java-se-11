package chapter04;

public class Exercise55 {
  Exception order(RuntimeException e) { // h1
    throw e; // h2
  }

  public static void main(String[] u) {
    var p = new Exercise55();
    try {
      p.order(new IndexOutOfBoundsException()); // h3
    } catch (RuntimeException e) { // h4
      System.out.print(e);
    }
  }
}
