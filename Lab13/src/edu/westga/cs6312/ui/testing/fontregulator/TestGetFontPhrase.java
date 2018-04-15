package edu.westga.cs6312.ui.testing.fontregulator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.ui.model.FontRegulator;

class TestGetFontPhrase {

    /**
     * Test get font phrase returns a value of "The next phrase"
     */
    @Test
    void testGetFontPhraseReturnsTheNextPhrase() {
        FontRegulator theFont = new FontRegulator("Arial", 15, "The next phrase");
        assertEquals("The next phrase", theFont.getFontPhrase());
    }
    
    /**
     * Test get font phrase returns a value of "Quality fonts from the world's best foundries."
     */
    @Test
    void testGetFontPhraseReturnsQualityFontsPhrase() {
        FontRegulator theFont = new FontRegulator("Typekit", -9, "Quality fonts from the world's best foundries.");
        assertEquals("Quality fonts from the world's best foundries.", theFont.getFontPhrase());
    }
}
