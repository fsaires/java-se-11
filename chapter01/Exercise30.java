package chapter01;

import java.util.Arrays;

public class Exercise30 {
  public static void main(String[] args) {
    var builder = new StringBuilder("54321");
    builder.substring(2);

    System.out.println(builder.substring(2));
    System.out.println(builder);

    System.out.println(builder.charAt(1));

  }
}
