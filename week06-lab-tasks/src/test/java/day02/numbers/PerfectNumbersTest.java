package day02.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerfectNumbersTest {

    @Test
    void testIsPerfectNumber() {
        PerfectNumbers perfectNumbers = new PerfectNumbers();
        assertEquals(true, perfectNumbers.isPerfectNumber(6));
        assertEquals(true, perfectNumbers.isPerfectNumber(8128));
        assertEquals(false, perfectNumbers.isPerfectNumber(7246));
        assertEquals(false, perfectNumbers.isPerfectNumber(9));
    }
}
