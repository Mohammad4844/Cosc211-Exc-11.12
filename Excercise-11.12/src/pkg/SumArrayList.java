package pkg;

import java.util.ArrayList;

public class SumArrayList {
  /**
   * sum
   * 
   * @param list, an ArrayList of doubles 
   * Sums up all the elements in list
   * @return the sum
   */
  public static double sum(ArrayList<Double> list) {
    double sum = 0;
    for (double currValue : list) {
      sum += currValue;
    }
    return sum;
  }
}
