package katas.lvl7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitsExplosionTest {
  DigitsExplosion digitsExplosion;

  @BeforeEach
  void setUp() {
    digitsExplosion = new DigitsExplosion();
  }

  @Test
  @DisplayName("It explodes the string 312 correctly")
  void itExplodesTheString312Test() {
    assertEquals("333122", digitsExplosion.explode("312"));
  }

  @Test
  @DisplayName("It explodes the string 0 correctly")
  void itExplodesTheString0Test() {
    assertEquals("", digitsExplosion.explode("0"));
  }
}
