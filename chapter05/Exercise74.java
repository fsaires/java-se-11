package chapter05;

import java.util.*;

public class Exercise74 {

  public static void main(String[] names) {
    var pennies = new ArrayList<>();
    pennies.add(1);
    pennies.add(2);
    pennies.add(Integer.valueOf(3));
    pennies.add(Integer.valueOf(4));
    pennies.remove(2);
    pennies.remove(Integer.valueOf(1));
    System.out.println(pennies);

  }
}