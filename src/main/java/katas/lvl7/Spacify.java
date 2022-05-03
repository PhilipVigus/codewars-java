package katas.lvl7;

public class Spacify {
  public String spacify(String str) {
    return String.join(" ", str.split(""));
  }
}
