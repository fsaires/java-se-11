package chapter04;

import java.io.*;

public class Exercise46 {
  public void performBackup() {
    try {
      throw new IOException("Disk not found"); // z1
    } catch (Exception e) {
      try {
        throw new FileNotFoundException("File not found");
      } catch (FileNotFoundException f) { // z2
        System.out.print("Failed");
      }
    }
  }

  public static void main(String... files) {
    new Exercise46().performBackup(); // z2
  }
}