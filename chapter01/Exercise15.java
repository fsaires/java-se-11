package chapter01;

import java.util.ArrayList;

public class Exercise15 {
  public static void main(String[] args) {
    var list = new ArrayList<Integer>();
    list.add(10);
    list.add(9);
    list.add(8);
    var num = 9;

    System.out.println(list);

    list.removeIf(x -> {
      int keep = num;
      return x != keep;
    });

    System.out.println(list);

    list.removeIf(x -> {
      int keep = num;
      return x == keep;
    });
    System.out.println(list);

  }

}
