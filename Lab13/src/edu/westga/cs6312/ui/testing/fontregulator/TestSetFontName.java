package edu.westga.cs6312.ui.testing.fontregulator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.ui.model.FontRegulator;

class TestSetFontName {

    /**
     * Test set font name returns a value of Alabama 
     */
    @Test
    void testSetFontNameReturnsAlabama15AndSamplePhrase() {
        FontRegulator theFont = new FontRegulator("Arial", 15, "The next phrase");
        theFont.setFontName("Alabama");
        assertEquals("Alabama 15 The next phrase", theFont.toString());
    }
    
    /**
     * Test set font name returns a value of Classical 
     */
    @Test
    void testSetFontNameReturnsClassical99AndSamplePhrase() {
        FontRegulator theFont = new FontRegulator("Arial", 99, "The next phrase");
        theFont.setFontName("Classical");
        assertEquals("Classical 99 The next phrase", theFont.toString());
    }
}
