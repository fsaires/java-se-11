package chapter01;

public class Exercise23 {
  public static void main(String[] args) {
    var teams = new String("694");
    teams.concat(" 1155");

    var teams1 = teams.concat(" 1155");

    System.out.println(teams1);

    teams.concat(" 2265");
    teams.concat(" 2869");
    System.out.println(teams);
  }
}
