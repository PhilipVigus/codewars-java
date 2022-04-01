package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestKataTest {
    @Test
    void test() {
        TestKata kata = new TestKata();

        assertEquals(1, kata.testMethod());
    }
}