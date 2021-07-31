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
    void encryptionTest_withSpace() {
        CeaserLogic testceaser= new CeaserLogic("he ll",3);

        assertEquals("KH OO", testceaser.getEncoded());
    }
    @Test
    void encryptionTest_withoutSpace() {
        CeaserLogic testceaser= new CeaserLogic("hell",3);

        assertEquals("KHOO", testceaser.getEncoded());
    }
    @Test
    void decryptionTest_withSpace() {
        CeaserLogic testceaser= new CeaserLogic("he ll",3);
        assertEquals("HE LL", testceaser.getDecord());
    }
    @Test
    void decryptionTest_withoutSpace() {
        CeaserLogic testceaser= new CeaserLogic("hell",3);
        assertEquals("HELL", testceaser.getDecord());
    }
}