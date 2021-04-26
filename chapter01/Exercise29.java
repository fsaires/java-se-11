package chapter01;

import java.util.Arrays;

public class Exercise29 {
  public static void main(String[] args) {
    var babies = Arrays.asList("chick", "cygnet", "duckling");
    babies.replaceAll(x -> {
      var newValue = "baby";
      return newValue;
    });
    System.out.println(babies);

  }
}
