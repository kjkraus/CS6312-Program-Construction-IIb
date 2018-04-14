package edu.westga.cs6312.ui.testing.font;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.ui.model.Font;

class TestSetFontName {

    /**
     * Test set font name returns a value of Alabama 
     */
    @Test
    void testSetFontNameReturnsAlabama15AndSamplePhrase() {
        Font theFont = new Font("Arial", 15, "The next phrase");
        theFont.setFontName("Alabama");
        assertEquals("Alabama 15 The next phrase", theFont.toString());
    }
    
    /**
     * Test set font name returns a value of Classical 
     */
    @Test
    void testSetFontNameReturnsClassical99AndSamplePhrase() {
        Font theFont = new Font("Arial", 99, "The next phrase");
        theFont.setFontName("Classical");
        assertEquals("Classical 99 The next phrase", theFont.toString());
    }
}
