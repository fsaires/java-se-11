package chapter02;

public class Exercise23 {
  public final static void main(String... args) {
    boolean balloonInflated = false;
    do {
      if (!balloonInflated) {
        balloonInflated = true;
        System.out.print("inflate-");
      }
    } while (!balloonInflated);
    System.out.println("done");
  }
}