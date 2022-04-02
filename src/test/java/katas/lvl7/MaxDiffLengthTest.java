package katas.lvl7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxDiffLengthTest {
  MaxDiffLength maxDiffLength;

  @BeforeEach
  void setUp() {
    maxDiffLength = new MaxDiffLength();
  }

  @Test
  @DisplayName("It returns -1 if the first array is empty")
  void itReturnsMinusOneIfTheFirstArrayIsEmptyTest() {
    String[] a1 = new String[] {};
    String[] a2 = new String[] {"test"};
    assertEquals(-1, maxDiffLength.maxDiffLength(a1, a2));
  }

  @Test
  @DisplayName("It returns -1 if the second array is empty")
  void itReturnsMinusOneIfTheSecondArrayIsEmptyTest() {
    String[] a1 = new String[] {"test"};
    String[] a2 = new String[] {};
    assertEquals(-1, maxDiffLength.maxDiffLength(a1, a2));
  }

  @Test
  @DisplayName("It returns -1 if both arrays are empty")
  void itReturnsMinusOneIfBothArraysAreEmptyTest() {
    String[] a1 = new String[] {};
    String[] a2 = new String[] {};
    assertEquals(-1, maxDiffLength.maxDiffLength(a1, a2));
  }
}
