package chapter05;

import java.util.*;

public class Exercise46 {

  public static void main(String[] args) {
    Comparator<Integer> c = (x, y) -> y - x;
    var ints = Arrays.asList(3, 1, 4);
    Collections.sort(ints, c);
    System.out.println(Collections.binarySearch(ints, 1));

  }

}