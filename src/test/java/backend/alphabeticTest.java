package backend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class alphabeticTest {
    @Test
    void alphabeticTest_getterMethod() {
        Alphabetic testAlphabet = new Alphabetic();
        char[] results = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        assertArrayEquals(results, testAlphabet.getLetterOfAlphabet());
    }
}