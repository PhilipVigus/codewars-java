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

  @Test
  @DisplayName("It returns the correct number when two non-empty arrays are passed in")
  void itReturnsCorrectlyForTwoNonEmptyArrays()
  {
    String[] a1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
    String[] a2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};

    assertEquals(13, maxDiffLength.maxDiffLength(a1, a2));
  }
}
