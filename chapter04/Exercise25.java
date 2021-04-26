package chapter04;

public class Exercise25 {

  public int play(String name) throws RuntimeException {
    try {
      throw new RuntimeException(name);
    } catch (Throwable e) {
      throw new RuntimeException(e);
    }
  }

  public static final void main(String[] ball) throws RuntimeException {
    new Exercise25().play("Webby");
    new Exercise25().play("Georgette");
  }
}
