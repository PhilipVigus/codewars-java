package katas.lvl8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class StringToArrayTest {
  StringToArray stringToArray;

  @BeforeEach
  void setUp() {
    stringToArray = new StringToArray();
  }

  @Test
  void returnsArrayWithNoElementsFromEmptyStringTest() {
    String[] expectedResult = new String[] {};
    assertArrayEquals(expectedResult, stringToArray.stringToArray(""));
  }

  @Test
  void returnsCorrectArrayForStringWithTwoWordsTest() {
    String[] expectedResult = new String[] {"Robin", "Singh"};
    assertArrayEquals(expectedResult, stringToArray.stringToArray("Robin Singh"));
  }

  @Test
  void returnsCorrectArrayForStringWithLotsOfWordsTest() {
    String[] expectedResult = new String[] {"I", "love", "arrays", "they", "are", "my", "favorite"};
    assertArrayEquals(
        expectedResult, stringToArray.stringToArray("I love arrays they are my favorite"));
  }
}
