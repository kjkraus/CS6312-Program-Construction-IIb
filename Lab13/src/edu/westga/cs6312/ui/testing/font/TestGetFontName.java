package edu.westga.cs6312.ui.testing.font;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.ui.model.Font;

class TestGetFontName {

    /**
     * Test get font name returns a value of Arial
     */
    @Test
    void testGetFontNameReturnsArial() {
        Font theFont = new Font("Arial", 15, "The next phrase");
        assertEquals("Arial", theFont.getFontName());
    }
    
    /**
     * Test get font name returns a value of Times New Roman
     */
    @Test
    void testGetFontNameReturnsTimesNewRoman() {
        Font theFont = new Font("Times New Roman", 1000, "The final phrase");
        assertEquals("Times New Roman", theFont.getFontName());
    }

}
