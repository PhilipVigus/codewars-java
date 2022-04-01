package katas.lvl8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharProblemTest {
    CharProblem charProblem;

  @BeforeEach
  void setUp() {
      charProblem = new CharProblem();
  }

    @Test
  void returns5WhenTheAgeIs5() {
    assertEquals(5, charProblem.howOld("5 years old"));
  }
}