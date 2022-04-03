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
}
