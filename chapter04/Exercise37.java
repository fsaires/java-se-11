package chapter04;

class ProblemException extends Exception {
  ProblemException(Exception e) {
    super(e);
  }
}

class MajorProblemException extends ProblemException {
  MajorProblemException(Exception e) {
    super(e);
  }
}

public class Exercise37 {
  public static void main(String[] args) throws Exception {
    try {
      System.out.print(1);
      throw new MajorProblemException(new IllegalStateException());
    } catch (ProblemException | RuntimeException e) {
      System.out.print(2);
      try {
        throw new MajorProblemException(e);
      } finally {
        System.out.print(3);
      }
    } finally {
      System.out.print(4);
    }
  }
}
