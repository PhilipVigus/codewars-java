package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
  TwoSum twoSum;

  @BeforeEach
  void setUp() {
    twoSum = new TwoSum();
  }

  @Test
  void itReturnsTheCorrectSolutionForATwoNumberArray() {
    int[] expectedSolution = {0, 1};
    int[] input = {3, 3};

    assertArrayEquals(expectedSolution, twoSum.twoSum(input, 6));
  }

  @Test
  void itReturnsTheCorrectSolutionForAThreeNumberArray() {
    int[] expectedSolution = {1, 2};
    int[] input = {3, 2, 4};

    assertArrayEquals(expectedSolution, twoSum.twoSum(input, 6));
  }

  @Test
  void itReturnsTheCorrectSolutionForAFourNumberArray() {
    int[] expectedSolution = {0, 1};
    int[] input = {2, 7, 11, 15};

    assertArrayEquals(expectedSolution, twoSum.twoSum(input, 9));
  }
}
