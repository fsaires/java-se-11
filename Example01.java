public interface InterfaceOne {
  int field = 99;

  default void method() {
    System.out.println(field);
  }
}

public interface InterfaceTwo {
  int field = 99;

  private void method() {
    System.out.println(field);
  }
}

public class Example01 implements InterfaceOne, InterfaceTwo {

  public static void main(String[] names) {
    Example01 theInstance = new Example01();

    theInstance.method();

  }
}