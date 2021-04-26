package chapter01;

public class Exercise02 {
  public static void main(String[] args) {

    int meal = 5;
    int tip = 2;
    var total = meal + (meal > 6 ? tip++ : tip--);

    System.out.println(total);

  }
}
