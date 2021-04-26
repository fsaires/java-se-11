package chapter02;

public class Exercise27 {
  public final static void main(String[] args) {

    var nycTour = new String[] { "Downtown", "Uptown", "Brooklyn" };
    var times = new String[] { "Day", "Night" };
    for (int i = 1, j = 0; i < nycTour.length && j < times.length; i++, j++)
      // for (int i = 0, j = 1; i < nycTour.length && j < times.length; i++, j++)
      System.out.println(nycTour[i] + "-" + times[j]);
  }
}