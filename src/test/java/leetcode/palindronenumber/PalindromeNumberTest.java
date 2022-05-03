package leetcode.palindronenumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {
  PalindromeNumber palindromeNumber;

  @BeforeEach
  void setUp() {
    palindromeNumber = new PalindromeNumber();
  }

  @Test
  void isPalindromeReturnsTrueFor1() {
    assertTrue(palindromeNumber.isPalindrome(1));
  }

  @Test
  void isPalindromeReturnsTrueFor121() {
    assertTrue(palindromeNumber.isPalindrome(121));
  }

  @Test
  void isPalindromeReturnsFalseFor12() {
    assertFalse(palindromeNumber.isPalindrome(12));
  }

  @Test
  void isPalindromeReturnsTrueFor22() {
    assertTrue(palindromeNumber.isPalindrome(22));
  }

  @Test
  void isPalindromeReturnsTrueFor2211221122() {
    assertTrue(palindromeNumber.isPalindrome(21122112));
  }

  @Test
  void isPalindromeReturnsFalseForNegativeNumbers() {
    assertFalse(palindromeNumber.isPalindrome(-21122112));
  }

  @Test
  void isPalindromeNoStringsReturnsTrueFor121() {
    assertTrue(palindromeNumber.isPalindromeNoStrings(121));
  }

  @Test
  void isPalindromeNoStringsReturnsTrueFor11() {
    assertTrue(palindromeNumber.isPalindromeNoStrings(11));
  }

  @Test
  void isPalindromeNoStringsReturnsTrueFor12133121() {
    assertTrue(palindromeNumber.isPalindromeNoStrings(12133121));
  }

  @Test
  void isPalindromeNoStringsReturnsFalseFor123121() {
    assertFalse(palindromeNumber.isPalindromeNoStrings(123121));
  }

  @Test
  void isPalindromeNoStringsReturnsFalseForNegativeNumbers() {
    assertFalse(palindromeNumber.isPalindromeNoStrings(-21122112));
  }
}
