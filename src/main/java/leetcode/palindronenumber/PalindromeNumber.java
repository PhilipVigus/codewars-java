package leetcode.palindronenumber;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeNumber {
  public boolean isPalindrome(int x) {
    final String[] numbers = Integer.toString(x).split("");

    int left = 0;
    int right = numbers.length - 1;

    while (left < right) {
      if (!numbers[left].equals(numbers[right])) {
        return false;
      }

      left++;
      right--;
    }

    return true;
  }

  public boolean isPalindromeNoStrings(int x) {
    if (x < 0) {
      return false;
    }

    int number = x;
    int divisor = 10;
    int remainder = number % divisor;
    Deque<Integer> numbers = new ArrayDeque<>();

    while (remainder != number) {
      numbers.addLast(remainder);
      number = (number - remainder) / divisor;
      remainder = number % divisor;
    }

    numbers.addLast(number);

    int left;
    int right;

    while (numbers.size() > 1) {
      left = numbers.removeFirst();
      right = numbers.removeLast();

      if (left != right) {
        return false;
      }
    }

    return true;
  }
}
