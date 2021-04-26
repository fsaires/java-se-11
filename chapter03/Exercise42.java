package chapter03;

@FunctionalInterface
public interface Exercise42 {
  public static void baseball() {
  }

  private static void soccer() {
  }

  default void play() {
  }

  void fun();
}