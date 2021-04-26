package chapter04;

public class Exercise47 extends RuntimeException {
  public static void main(String[] args) throws Exception {
    try {
      throw new Exercise47();
    } catch (RuntimeException e) {
      System.out.println(e.getCause());
    }
  }
}
