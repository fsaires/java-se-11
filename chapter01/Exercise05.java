package chapter01;

public class Exercise05 {
  public static void main(String[] args) {

    var line = new StringBuilder("-");
    System.out.println(line.length());
    var anotherLine = line.append("-");
    System.out.println(anotherLine.length());
    System.out.print(line == anotherLine);
    System.out.print(" ");
    System.out.print(line.length());

  }
}
