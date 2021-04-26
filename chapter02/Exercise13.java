package chapter02;

public class Exercise13 {
  public final static void main(String... arguments) {
    int pterodactyl = 8;
    long triceratops = 3;
    if (pterodactyl % 3 > 1 + 1)
      triceratops++;
    triceratops--;
    System.out.print(triceratops);
  }
}