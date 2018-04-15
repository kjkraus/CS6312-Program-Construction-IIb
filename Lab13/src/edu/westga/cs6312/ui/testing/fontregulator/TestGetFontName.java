package edu.westga.cs6312.ui.testing.fontregulator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.ui.model.FontRegulator;

class TestGetFontName {

    /**
     * Test get font name returns a value of Arial
     */
    @Test
    void testGetFontNameReturnsArial() {
        FontRegulator theFont = new FontRegulator("Arial", 15, "The next phrase");
        assertEquals("Arial", theFont.getFontName());
    }
    
    /**
     * Test get font name returns a value of Times New Roman
     */
    @Test
    void testGetFontNameReturnsTimesNewRoman() {
        FontRegulator theFont = new FontRegulator("Times New Roman", 1000, "The final phrase");
        assertEquals("Times New Roman", theFont.getFontName());
    }

}
