package katas.lvl8;

// https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1
public class CharProblem {
  public int howOld(final String ageString) {
    char ageChar = ageString.charAt(0);

    return Character.getNumericValue(ageChar);
  }
}
