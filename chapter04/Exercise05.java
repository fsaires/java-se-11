package chapter04;

class LostBallException extends Exception {
}

public class Exercise05 {
public void toss() throw LostBallException {
var windUp = new int[0];
System.out.println(windUp[0]);
}

  public static void main(String[] bouncy) {
    try {
      new Exercise05().toss();
    } catch (Throwable e) {
      System.out.print("Caught!");
    }
  }
}
