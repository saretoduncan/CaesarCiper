package backend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeaserLogicTest {
    @Test
    void testForStingInput() {
        CeaserLogic testceaser= new CeaserLogic("hi",1);
        assertEquals(true, testceaser instanceof CeaserLogic);
    }
    @Test
    void testForString_toCharArray() {
        CeaserLogic testceaser= new CeaserLogic("hello everyone",3);
        String str="hello everyone".toUpperCase();

        assertEquals(str, testceaser.getWord());
    }

    @Test
    void encryptionTest() {
        CeaserLogic testceaser= new CeaserLogic("hell",3);

        assertEquals("KHOO", testceaser.getEncoded());
    }
}