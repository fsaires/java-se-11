package chapter03;

class Bush extends Exercise30 {
  String type = "bush";
}

public class Exercise30 {
  String type = "plant";

  public static void main(String[] args) {
    Exercise30 w1 = new Bush();
    Bush w2 = new Bush();
    Exercise30 w3 = w2;
    System.out.print(w1.type + "," + w2.type + "," + w3.type);
  }
}