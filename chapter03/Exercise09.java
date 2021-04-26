package chapter03;

public class Exercise09 {
  private int size;

  public Exercise09(int size) {
    this.size = size;
  }

  // insert constructor here
  public static void sendHome(Exercise09 p, int newSize) {
    p = new Exercise09(newSize);
    p.size = 4;
  }

  public static final void main(String... params) {
    final var phone = new Exercise09(3);
    sendHome(phone, 7);
    System.out.print(phone.size);
  }
}