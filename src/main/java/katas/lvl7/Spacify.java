package katas.lvl7;

public class Spacify {
  public String spacify(String str) {
    String[] chars = str.split("");

    return String.join(" ", chars);
  }
}
