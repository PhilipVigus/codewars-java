package katas.lvl7;

import java.util.Arrays;
import java.util.Comparator;

public class MaxDiffLength {
  public int maxDiffLength(String[] a1, String[] a2) {
    if (a1.length == 0 || a2.length == 0) {
      return -1;
    }

    return Math.max(getMaxLength(a1) - getMinLength(a2), getMaxLength(a2) - getMinLength(a1));
  }

  private int getMinLength(String[] a) {
    return Arrays.stream(a).min(Comparator.comparing(String::length)).get().length();
  }

  private int getMaxLength(String[] a) {
    return Arrays.stream(a).max(Comparator.comparing(String::length)).get().length();
  }
}
