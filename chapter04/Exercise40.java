package chapter04;

class TimeException extends Exception {
}

class TimeMachine implements AutoCloseable {
  int v;

  public TimeMachine(int v) {
    this.v = v;
  }

  public void close() throws Exception {
    System.out.print(v);
  }
}

public class Exercise40 {
  public static void main(String[] twelve) throws Exception {
    try (var timeSled = new TimeMachine(1); var delorean = new TimeMachine(2); var tardis = new TimeMachine(3)) {
    } catch (TimeException e) {
      System.out.print(4);
    } finally {
      System.out.print(5);
    }
  }
}