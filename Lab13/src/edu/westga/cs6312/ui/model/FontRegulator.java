package edu.westga.cs6312.ui.model;

/**
 * This class models a font which and its characteristics including
 *  font name, font size, and phrase displayed.
 * 
 * @author Kent Kraus
 * @version 2018-04-14
 */
public class FontRegulator {
    private String fontName;
    private int fontSize;
    private String fontPhrase;
    
    /**
     * 3-parameter constructor to create the Font object
     * 
     * @param fontName	the name of the font
     * @param fontSize	the size of the font in pixels
     * @param fontPhrase	the phrase displayed with the font
     */
    public FontRegulator(String fontName, int fontSize, String fontPhrase) {
        this.fontName = fontName;
        this.fontSize = fontSize;
        this.fontPhrase = fontPhrase;
    }
    	
    /**
     * Accessor for the fontName
     * 
     * @return	 the font name
     */
    public String getFontName() {
        return this.fontName;
    }
        
    /**
     * Mutator for the font name
     * 
     * @param fontName	the name of the font
     */
    public void setFontName(String fontName) {
        this.fontName = fontName;
    }
        
    /**
     * Accessor for the font size
     * 
     * @return	 the font size
     */
    public int getFontSize() {
        return this.fontSize;
    }
        
    /**
     * Mutator for the font size
     * 
     * @param fontSize	the size of the font
     */
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
        
    /**
     * Accessor for the font phrase
     * 
     * @return	 the font phrase displayed
     */
    public String getFontPhrase() {
        return this.fontPhrase;
    }
        
    /**
     * Mutator for the font phrase
     * 
     * @param fontPhrase 	the font phrase displayed
     */
    public void setFontPhrase(String fontPhrase) {
        this.fontPhrase = fontPhrase;
    }
    
    /**
     * Builds and returns an output of the font characteristics
     * 
     * @return	a String representation of the font and its characteristics
     */
	public String toString() {
	    String result = "";
	    result = this.getFontName() + " " + this.getFontSize()
	    	+ " " + this.getFontPhrase();
	    return result;
	}   
}
