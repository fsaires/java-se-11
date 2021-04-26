package chapter05;

import java.util.*;

public class Exercise26 {

  public static void main(String[] args) {
    var linux = new String[] { "Linux", "Mac", "Windows" };
    var mac = new String[] { "Mac", "Linux", "Windows" };
    var search = Arrays.binarySearch(linux, "Linux");
    var mismatch1 = Arrays.mismatch(linux, mac);
    var mismatch2 = Arrays.mismatch(mac, mac);
    System.out.println(search + " " + mismatch1 + " " + mismatch2);

  }

}