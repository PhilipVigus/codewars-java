package katas.lvl7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpacifyTest {
  Spacify spacify;

  @BeforeEach
  void setUp() {
    spacify = new Spacify();
  }

  @Test
  @DisplayName("It expands the empty string correctly")
  void itExpandsTheEmptyStringCorrectly() {
    assertEquals("", spacify.spacify(""));
  }

  @Test
  @DisplayName("It expands a nonempty string correctly")
  void itExpandsANonEmptyStringCorrectly() {
    assertEquals("a b c", spacify.spacify("abc"));
  }

  @Test
  @DisplayName("It expands a string with spaces and numbers")
  void itExpandsStringWithSpacesAndNumbersCorrectly() {
    assertEquals("1 2 3   4 5 a", spacify.spacify("123 45a"));
  }
}
