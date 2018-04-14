package edu.westga.cs6312.ui.testing.font;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.ui.model.Font;

class TestSetFontPhrase {

    /**
     * Test set font phrase returns a value of "I love Java!"
     */
    @Test
    void testSetFontPhraseReturnsILoveJava() {
        Font theFont = new Font("Arial", 15, "The next phrase");
        theFont.setFontPhrase("I love Java!");
        assertEquals("Arial 15 I love Java!", theFont.toString());
    }
    
    /**
     * Test set font phrase returns a value of "To be or not to be"
     */
    @Test
    void testSetFontPhraseReturnsToBeOrNotToBe() {
        Font theFont = new Font("zxywvut", 99, "another phrase");
        theFont.setFontPhrase("To be or not to be");
        assertEquals("zxywvut 99 To be or not to be", theFont.toString());
    }

}
