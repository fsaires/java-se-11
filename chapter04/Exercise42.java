package chapter04;

import java.io.*;

class CarCrash extends RuntimeException {
  CarCrash(Exception e) {
  }
  // w1
}

public class Exercise42 {
  public static void main(String[] s) throws Exception {
    // w2
    try {
      throw new IOException("Auto-pilot error");
    } catch (CarCrash e) {
      // w3
      throw e;
    } catch (Exception a) {
      // w4
      throw a;
    }
  }
}