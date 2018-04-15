package edu.westga.cs6312.ui.testing.fontregulator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.ui.model.FontRegulator;

class TestSetFontSize {

    /**
     * Test set font size returns a value of 1001 
     */
    @Test
    void testSetFontSizeReturns1001() {
        FontRegulator theFont = new FontRegulator("Trade Neo", 0, "The next phrase");
        theFont.setFontSize(1001);
        assertEquals("Trade Neo 1001 The next phrase", theFont.toString());
    }
    
    /**
     * Test set font size returns a value of -99
     */
    @Test
    void testSetFontSizeReturnsNegative99() {
        FontRegulator theFont = new FontRegulator("Gothic", 100, "The next phrase");
        theFont.setFontSize(-99);
        assertEquals("Gothic -99 The next phrase", theFont.toString());
    }

}
