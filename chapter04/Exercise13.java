package chapter04;

import java.io.IOException;

public class Exercise13 {
  public static void main(String[] v) throws Exception {
    try {
      new Exercise13().turnOn();
    } catch (RuntimeException v) { // y1 Error - mesmo nome de variável.
      System.out.println(v);
      throw new IOException(); // y2
    } finally {
      System.out.println("complete");
    }
  }

  public void turnOn() throws IOException {
    new IOException("Not ready"); // y3
  }
}
