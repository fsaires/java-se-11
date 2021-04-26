package chapter02;

import java.util.List;

public class Exercise11 {
  public static void main(String[] args) {
    var bottles = List.of("glass", "plastic", "can");

    System.out.println(bottles.size());

    for (int type = 1; type < bottles.size();) {
      System.out.print(bottles.get(type) + "-");
      if (type < bottles.size())
        break;
    }
    System.out.print("end");
  }

}