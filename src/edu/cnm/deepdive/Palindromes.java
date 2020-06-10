package edu.cnm.deepdive;

public class Palindromes {

  public static boolean testRecursive(String input) {
    return input.length() <= 1
        || (
        input.charAt(0) == input.charAt(input.length() - 1)
            && testRecursive(input.substring(1, input.length() - 1))
    );
  }

  public static boolean testDenormalized(String input) {
    String normalized = input.replaceAll("[\\W_]+", "").toLowerCase();
    return testRecursive(normalized);
  }

  public static boolean testIterative(String input) {
    StringBuilder builder = new StringBuilder(input);
    return input.equals(builder.reverse().toString()); // No good!
  }

}
