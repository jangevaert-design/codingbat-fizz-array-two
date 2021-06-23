package edu.cnm.deepdive;

/*
Given a number n, create and return a new string array of length n, containing the strings
"0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array.

fizzArray2(4) → ["0", "1", "2", "3"]
fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
fizzArray2(2) → ["0", "1"]
 */

import java.util.Arrays;

public class CodingBatFizzArrayTwo {

  public static void main(String[] args) {
    // how to split this up in separate Strings and print out ["0", "1", "2"]? -
    System.out.printf("Given the int %d, the result is " + Arrays.toString(fizzArray2(4)) + ".\n", 4);
  }

  public static String[] fizzArray2(int n) {
    String[] result = new String[n];

    if (n == 0) {
      result = new String[0];
    }
    for (int i = 0; i < n; i++) {
      result[i] = String.valueOf(i);
    }
    return result;
  }

}
