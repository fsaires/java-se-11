package chapter02;

import java.util.List;

public class Exercise29 {

  public void travel(List<Integer> roads) {
    for (int w = 1; w <= roads.size(); w++)
      System.out.print(roads.get(w - 1));
  }

  public static void main(String[] args) {

  }

}