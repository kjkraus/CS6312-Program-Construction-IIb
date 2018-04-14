package edu.westga.cs6312.ui.testing.font;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.ui.model.Font;

class TestCreateFont {

    /**
     * Test 3-parameter constructor creates a Font with values
     *   Hi 0 0
     */
    @Test
    void testThreeParameterConstructorCreatesFontWithHiZeroZero() {
        Font theFont = new Font("Hi", 0, "0");
        assertEquals("Hi 0 0", theFont.toString());
    }
    
    /**
     * Test 3-parameter constructor creates a Font with values
     *   abcdefghijklmnopqrstuvwxyz  999  and  Florida
     */
    @Test
    void testThreeParameterConstructorCreatesFontWithAlphabet999AndFlorida() {
        Font theFont = new Font("abcdefghijklmnopqrstuvwxyz", 999, "Florida");
        assertEquals("abcdefghijklmnopqrstuvwxyz 999 Florida", theFont.toString());
    }
    
    /**
     * Test 3-parameter constructor creates a Font with values
     *   Sans serif  10  and  This is a sample phrase
     */
    @Test
    void testThreeParameterConstructorCreatesFontWithSansserif10AndSamplePhrase() {
        Font theFont = new Font("Sans serif", 10, "This is a sample phrase");
        assertEquals("Sans serif 10 This is a sample phrase", theFont.toString());
    }
}
