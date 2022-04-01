package katas.lvl8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

  @Test
  void returns9WhenTheAgeIs9() {
    assertEquals(9, charProblem.howOld("9 years old"));
  }

  @Test
  void returns9WhenTheAgeIs1() {
    assertEquals(1, charProblem.howOld("1 years old"));
  }
}
