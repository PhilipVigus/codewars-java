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
  void countsZeroSheepTest() {
    assertEquals("", countingSheep.countingSheep(0));
  }

  @Test
  void countsOneSheepTest() {
    assertEquals("1 sheep...", countingSheep.countingSheep(1));
  }

  @Test
  void countsTwoSheepTest() {
    assertEquals("1 sheep...2 sheep...", countingSheep.countingSheep(2));
  }

  @Test
  void countsThreeSheepTest() {
    assertEquals("1 sheep...2 sheep...3 sheep...", countingSheep.countingSheep(3));
  }
}
