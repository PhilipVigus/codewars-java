package leetcode;

import leetcode.twosum.TwoSum;
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
  void itBruteReturnsTheCorrectSolutionForATwoNumberArray() {
    int[] expectedSolution = {0, 1};
    int[] input = {3, 3};

    assertArrayEquals(expectedSolution, twoSum.twoSumBruteForce(input, 6));
  }

  @Test
  void itBruteReturnsTheCorrectSolutionForAThreeNumberArray() {
    int[] expectedSolution = {1, 2};
    int[] input = {3, 2, 4};

    assertArrayEquals(expectedSolution, twoSum.twoSumBruteForce(input, 6));
  }

  @Test
  void itBruteReturnsTheCorrectSolutionForAFourNumberArray() {
    int[] expectedSolution = {0, 1};
    int[] input = {2, 7, 11, 15};

    assertArrayEquals(expectedSolution, twoSum.twoSumBruteForce(input, 9));
  }

  @Test
  void itEfficientlyReturnsTheCorrectSolutionForATwoNumberArray() {
    int[] expectedSolution = {0, 1};
    int[] input = {3, 3};

    assertArrayEquals(expectedSolution, twoSum.twoSumEfficient(input, 6));
  }

  @Test
  void itEfficientlyReturnsTheCorrectSolutionForAFourNumberArray() {
    int[] expectedSolution = {0, 1};
    int[] input = {2, 7, 11, 15};

    assertArrayEquals(expectedSolution, twoSum.twoSumEfficient(input, 9));
  }
}
