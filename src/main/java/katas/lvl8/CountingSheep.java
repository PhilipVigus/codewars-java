package katas.lvl8;

// https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
public class CountingSheep {
  public String countingSheep(int num) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < num; i++) {
      result.append(i + 1);
      result.append(" sheep...");
    }

    return result.toString();
  }
}
