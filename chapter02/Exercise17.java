package chapter02;

public class Exercise17 {
  public final static void main(String... arguments) {
    var flavors = 30;
    int eaten = 0;
    switch (flavors) {
    case 30:
      eaten++;
      System.out.println(eaten);
    case 40:
      eaten += 2;
      System.out.println(eaten);
    default:
      eaten--;
      System.out.println(eaten);
    }
    System.out.print(eaten);
  }
}
