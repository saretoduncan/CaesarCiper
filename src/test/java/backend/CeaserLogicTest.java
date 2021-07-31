package backend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeaserLogicTest {
    @Test
    void testForStingInput() {
        CeaserLogic testceaser= new CeaserLogic("hi");
        assertEquals(true, testceaser instanceof CeaserLogic);
    }
    @Test
    void testForString_toCharArray() {
        CeaserLogic testceaser= new CeaserLogic("hello everyone");
        char[] results="hello everyone".toCharArray();
        assertArrayEquals(results, testceaser.getToArr());
    }
}