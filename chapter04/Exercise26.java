package chapter04;

import java.io.IOException;

class Organ {
  public void operate() throws IOException {
    throw new RuntimeException("Not supported");
  }
}

public class Exercise26 extends Organ {
  public void operate() throws Exception {
    System.out.print("beat");
  }

  public static void main(String... c) throws Exception {
    try {
      new Exercise26().operate();
    } finally {
      System.out.print("!");
    }
  }
}