package chapter05;

import java.util.*;

public class Exercise21 {

  public static void main(String[] args) {
    var x = new LinkedList<Integer>();
    x.offer(18);
    x.offer(5);
    x.offer(10);
    // x.push(13);
    System.out.println(x.poll() + " " + x.poll() + " " + x.poll());

  }

}