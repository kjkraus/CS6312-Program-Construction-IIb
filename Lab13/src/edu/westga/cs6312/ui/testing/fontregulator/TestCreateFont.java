package edu.westga.cs6312.ui.testing.fontregulator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.ui.model.FontRegulator;

class TestCreateFont {

    /**
     * Test 3-parameter constructor creates a Font with values
     *   Hi 0 0
     */
    @Test
    void testThreeParameterConstructorCreatesFontWithHiZeroZero() {
        FontRegulator theFont = new FontRegulator("Hi", 0, "0");
        assertEquals("Hi 0 0", theFont.toString());
    }
    
    /**
     * Test 3-parameter constructor creates a Font with values
     *   abcdefghijklmnopqrstuvwxyz  999  and  Florida
     */
    @Test
    void testThreeParameterConstructorCreatesFontWithAlphabet999AndFlorida() {
        FontRegulator theFont = new FontRegulator("abcdefghijklmnopqrstuvwxyz", 999, "Florida");
        assertEquals("abcdefghijklmnopqrstuvwxyz 999 Florida", theFont.toString());
    }
    
    /**
     * Test 3-parameter constructor creates a Font with values
     *   Sans serif  10  and  This is a sample phrase
     */
    @Test
    void testThreeParameterConstructorCreatesFontWithSansserif10AndSamplePhrase() {
        FontRegulator theFont = new FontRegulator("Sans serif", 10, "This is a sample phrase");
        assertEquals("Sans serif 10 This is a sample phrase", theFont.toString());
    }
}
