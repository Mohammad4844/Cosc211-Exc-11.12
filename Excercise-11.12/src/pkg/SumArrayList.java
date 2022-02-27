package pkg;

import java.util.ArrayList;

/**
 * A container class which has the method needed for exercise 11.12
 */

public class SumArrayList {
  /**
   * sums up all the contents on any ArrayList, and returns the sum
   */
  public static double sum(ArrayList<Double> list) {
    double sum = 0;
    for (double currValue : list) {
      sum += currValue;
    }
    return sum;
  }
}
