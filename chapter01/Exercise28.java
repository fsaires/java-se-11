package chapter01;

public class Exercise28 {
  public static void main(String[] args) {
    boolean carrot = true;
    Boolean potato = false;
    var broccoli = true;
    carrot = carrot & potato;
    broccoli = broccoli ? !carrot : potato;
    potato = !broccoli ^ carrot;
    System.out.println(carrot + "," + potato + "," + broccoli);
  }
}
