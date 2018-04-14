package edu.westga.cs6312.ui.testing.font;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.ui.model.Font;

class TestGetFontSize {

    /**
     * Test get font size returns a value of 9999 
     */
    @Test
    void testGetFontSizeReturns9999() {
        Font theFont = new Font("Trade Neo", 9999, "The next phrase");
        assertEquals(9999, theFont.getFontSize());
    }
    
    /**
     * Test get font size returns a value of -100 
     */
    @Test
    void testGetFontSizeReturnsNegative100() {
        Font theFont = new Font("ABCDEFG", -100, "another phrase");
        assertEquals(-100, theFont.getFontSize());
    }

}
