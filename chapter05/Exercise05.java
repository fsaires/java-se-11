package chapter05;

import java.util.*;

public class Exercise05 {

  public static void main(String[] args) {
    var list = new ArrayList<Integer>();
    list.add(56);
    list.add(56);
    list.add(3);
    var set = new TreeSet<Integer>(list); // Remove elementos repetidos e faz sort
    System.out.print(set.size()); // Pega o tamanho
    System.out.print(" ");
    System.out.print(set.iterator().next()); // Pega o primeiro

  }

}