package edu.cnm.deepdive;

public class Factorials {

  /**
   *
   * @param n
   * @return the computed value of n!
   * @throws IllegalArgumentException when n < 0.
   */
  public static long computeRecursive(int n) throws IllegalArgumentException {
    long result = 1;
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (n > 0) {
      result = n * computeRecursive(n - 1);
    }
    return result;
  }

}
