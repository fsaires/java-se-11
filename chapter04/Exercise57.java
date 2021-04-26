package chapter04;

class DiskPlayer implements AutoCloseable {
  public void close() {
  }
}

public class Exercise57 {
  public static void main(String... bits) {
    DiskPlayer john = new DiskPlayer();
    try (john) {
      System.out.println("ping");
      john.close();
    } finally {
      System.out.println("pong");
      john.close();
    }
    System.out.println("return");
  }
}