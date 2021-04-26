package chapter05;

import java.util.*;

public class Exercise37 {

  public static void main(String[] args) {
    var os = new String[] { "Mac", "Linux", "Windows" };
    Arrays.sort(os);

    for (String o : os) {
      System.out.println(o);
    }

    System.out.println(Arrays.binarySearch(os, "RedHat"));
    System.out.println(Arrays.binarySearch(os, "Mac"));

  }

}