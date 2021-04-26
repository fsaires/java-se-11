package chapter03;

public class Exercise48 {
  private int rope = 1;
  protected boolean outside;

  public void Jump() {
    this(4);
    outside = true;
  }

  public void Jump(int rope) {
    this.rope = outside ? rope : rope + 1;
  }

  public static void main(String[] bounce) {
    System.out.print(new Jump().rope);
  }
}

class Jump {

}
