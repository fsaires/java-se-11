package chapter04;

class FunEvent implements AutoCloseable {
  private final int value;

  FunEvent(int value) {
    this.value = value;
  }

  public void close() {
    System.out.print(value);
  }
}

public class Exercise35 {
  public static void main(String... lots) {
    FunEvent e = new FunEvent(1);
    try (e; var f = new FunEvent(8)) {
      System.out.print("2");
      throw new ArithmeticException();
    } catch (Exception x) {
      System.out.print("3");
    } finally {
      System.out.print("4");
    }
  }
}