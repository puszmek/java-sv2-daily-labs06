package day04.layered;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinessModelTest {

    @Test
    void testSimpleWord() {
        BusinessModel businessModel = new BusinessModel("aaaa", 3);
        businessModel.takeGuess("a");
        assertTrue(businessModel.won());
    }

    @Test
    void testSimpleWordFail() {
        BusinessModel businessModel = new BusinessModel("aaaa", 3);
        businessModel.takeGuess("b");
        assertFalse(businessModel.won());
    }
}
