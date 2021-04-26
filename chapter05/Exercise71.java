package chapter05;

import java.util.*;

public class Exercise71 {

  public static void main(String[] args) {
    var numbers = Arrays.asList(3, 1, 4);
    numbers.set(1, null);
    int first = numbers.get(0);
    int middle = numbers.get(1);
    int last = numbers.get(3);
    System.out.println(first + " " + middle + " " + last);
  }

}