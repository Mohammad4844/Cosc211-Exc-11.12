package pkg;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class SumArrayListTest {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {}

  @Test
  public void testSum() {
    ArrayList<Double> testArray = new ArrayList<>();
    double actualSum, expectedSum;
    // Normal values
    testArray.addAll(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));
    actualSum = SumArrayList.sum(testArray);
    expectedSum = 15.0;
    assertEquals(actualSum, expectedSum, 0.000001);

    testArray.clear();
    // Negative values
    testArray.addAll(Arrays.asList(-1.0, -4.5, -1.5));
    actualSum = SumArrayList.sum(testArray);
    expectedSum = -7.0;
    assertEquals(actualSum, expectedSum, 0.000001);

    testArray.clear();
    // Zero values
    testArray.addAll(Arrays.asList(0.0, 0.0, 0.0));
    actualSum = SumArrayList.sum(testArray);
    expectedSum = 0.0;
    assertEquals(actualSum, expectedSum, 0.000001);

    testArray.clear();
    // Mixed type of values
    testArray.addAll(Arrays.asList(5.5, -2.0, 1.123));
    actualSum = SumArrayList.sum(testArray);
    expectedSum = 4.623;
    assertEquals(actualSum, expectedSum, 0.000001);


  }
}
