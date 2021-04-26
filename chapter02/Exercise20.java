package chapter02;

public class Exercise20 {
  public final static void main(String... args) {
    int count = 0;
    var stops = new String[] { "Washington", "Monroe", "Jackson", "LaSalle" };

    System.out.println(stops.length);

    while (count < stops.length)
      if (stops[++count].length() < 8)
        break;
      else
        continue;
    System.out.println(count);
  }
}