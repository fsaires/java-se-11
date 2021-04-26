package chapter04;

public class Exercise28 {
  public static void main(String... rain) throws Exception {
    var weatherTracker = new AutoCloseable() {
      public void close() throws RuntimeException {
        System.out.println("Thunder");
      }
    };

    try (weatherTracker) {
      System.out.println("Tracking");
    } catch (Exception e) {
      System.out.println("Lightning");
    } finally {
      System.out.println("Storm gone");
      weatherTracker.close();
    }
  }
}