package chapter05;

import java.util.*;

public class Exercise70 {

  public static void main(String[] args) {
    Queue<String> q = new ArrayDeque<>();
    q.add("snowball");
    q.addLast("sugar");
    q.addFirst("minnie");

    System.out.println(q.peek() + " " + q.peek() + " " + q.size());
  }

}