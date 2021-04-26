package chapter02;

import java.util.List;

public class Exercise30 {

  public static void main(String[] args) {
    final var javaVersions = List.of(9, 10, 11);
    var exams = List.of("1Z0-811", "1Z0-819");
    V: for (var e1 : javaVersions) {
      E: for (String e2 : exams) {
        System.out.println(e1 + "_" + e2);
        break;
      }
    }

  }

}