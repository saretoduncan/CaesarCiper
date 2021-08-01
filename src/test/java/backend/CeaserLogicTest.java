package backend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeaserLogicTest {
    @Test
    void testForStingInput() {
        CeaserLogic testceaser= new CeaserLogic("hi",1);//constructor takes in a string and a number
        assertEquals(true, testceaser instanceof CeaserLogic);
    }
    @Test
    void testForString_toCharArray() {
        CeaserLogic testceaser= new CeaserLogic("hello everyone",3);
        String str="hello everyone".toUpperCase();

        assertEquals(str, testceaser.getWord());//getter returns message as a string
    }

    @Test
    void encryptionTest_withSpace() {
        CeaserLogic testceaser= new CeaserLogic("he ll ll",3);

        assertEquals("KH OO OO", testceaser.getEncoded());//test words with space encryption
    }
    @Test
    void encryptionTest_withoutSpace() {
        CeaserLogic testceaser= new CeaserLogic("hell",3);

        assertEquals("KHOO", testceaser.getEncoded());//test word with no space encryption
    }
    @Test
    void decryptionTest_withSpace() {
        CeaserLogic testceaser= new CeaserLogic("he ll",3);
        assertEquals("HE LL", testceaser.getDecord());//test word with space decryption
    }
    @Test
    void decryptionTest_withoutSpace() {
        CeaserLogic testceaser= new CeaserLogic("hell",3);
        assertEquals("HELL", testceaser.getDecord());//test words with no space encryption
    }
}