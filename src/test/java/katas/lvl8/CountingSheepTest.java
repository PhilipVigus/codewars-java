package katas.lvl8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingSheepTest {
  CountingSheep countingSheep;

  @BeforeEach
  void setUp() {
    countingSheep = new CountingSheep();
  }

  @Test
  void countsZeroSheep() {
    assertEquals("", countingSheep.countingSheep(0));
  }
}
