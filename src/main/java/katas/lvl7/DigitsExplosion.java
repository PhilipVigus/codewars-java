package katas.lvl7;

public class DigitsExplosion {
  public String explode(String str) {
    StringBuilder builder = new StringBuilder();

    String[] arr = str.split("");

    for (String ch : arr) {
      int repetitions = Integer.parseInt(ch);

      for (int i = 0; i < repetitions; i++) {
        builder.append(ch);
      }
    }

    return builder.toString();
  }
}
