package edu.westga.cs6312.ui.view;

import edu.westga.cs6312.ui.model.Font;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * This class will manage the code that draws the Font GUI
 * 
 * @author Kent Kraus
 * @version 2018-04-18
 */
public class FontPane extends GridPane {
    private Font demoFont;
    private String[] fontNames;
    private String[] phraseTexts;
    private Text selectedText;
    private String selectedFontName;
    
    /**
     * 1-parameter constructor  that accepts a Font
     * 
     * @param	givenFont	Font with the data for the drawing
     */
    public FontPane(Font givenFont) {
        this.demoFont = givenFont;
        this.setFontPaneProperties();
        //this.getListViewComponents();
        //this.getComboBoxComponents();
        //this.getSliderComponents();
    }
    
    /**
     * Helper method to set the properties of the user interface
     */
    private void setFontPaneProperties() {
        setAlignment(Pos.CENTER);
        setPadding(new Insets(5, 5, 5, 5));
        setHgap(3.5);
        setVgap(3.5);
    }
    
    /**
     * Helper method to bring ListView components to the user interface
     */
    private void getListViewComponents() {
        VBox verticalGroup = new VBox();
        verticalGroup.setMaxWidth(100);
        
    }
    
    /**
     * Helper method to bring slider components to the user interface
     */
    private void getSliderComponents() {
        Slider sliderHorizontal = new Slider();
        sliderHorizontal.setShowTickLabels(true);
        sliderHorizontal.setShowTickMarks(true);
        
        this.selectedText = new Text(10, 50, "I love JavaFX");
        
        Pane paneForText = new Pane();
        paneForText.getChildren().add(this.selectedText);
        
        BorderPane textAndSliderPane = new BorderPane();
        textAndSliderPane.setCenter(paneForText);
        textAndSliderPane.setBottom(sliderHorizontal);
        
        //sliderHorizontal.valueProperty().addListener(ov ->
        //	this.selectedText.setFont(sliderHorizontal.getValue()));
    }
    
}
