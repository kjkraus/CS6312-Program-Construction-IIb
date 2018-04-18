package edu.westga.cs6312.ui.view;

import javafx.scene.text.Font;

import edu.westga.cs6312.ui.model.FontRegulator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;

/**
 * This class will manage the code that draws the Font GUI
 * 
 * @author Kent Kraus
 * @version 2018-04-17
 */
public class FontPane extends GridPane {
    private FontRegulator demoFont;
    private String[] fontNames = {"Arial", "Consolas", "Papyrus", "Times New Roman"};
    private String[] phraseTexts = {"I love JavaFx", "I can't wait for Summer", "Go Wolves"};
    private Label mainDisplayText;
    
    /**
     * 1-parameter constructor  that accepts a Font
     * 
     * @param	givenFont	Font with the data for the drawing
     */
    public FontPane(FontRegulator givenFont) {
        this.demoFont = givenFont;
        this.setFontPaneProperties();
        this.getListViewComponents();
        this.getComboBoxComponents();
        this.getSliderComponents();
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
        add(new Label("Font: "), 0, 0);
        ListView<String> theListView = new ListView<>(FXCollections.observableArrayList(this.fontNames));
        theListView.setPrefSize(200, 200);
        theListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        theListView.getSelectionModel().select(0);
        add(theListView, 0, 1);
        
        theListView.getSelectionModel().selectedItemProperty().addListener(ov -> {
            this.demoFont.setFontName(theListView.getSelectionModel().getSelectedItem());
            this.mainDisplayText.setFont(new Font(this.demoFont.getFontName(), (int) this.demoFont.getFontSize()));
        });
        
    }
    
    /**
     * Helper method to bring ComboBox components to the user interface
     */
    private void getComboBoxComponents() {
        add(new Label("Text: "), 1, 0);
        ComboBox<String> theComboBox = new ComboBox<>();
        theComboBox.setValue("I love JavaFX");
        
        add(theComboBox, 1, 1);
        ObservableList<String> comboBoxItems = FXCollections.observableArrayList(this.phraseTexts);
        theComboBox.getItems().addAll(comboBoxItems);
        
        this.demoFont.setFontPhrase(this.phraseTexts[0]);
        
        theComboBox.getSelectionModel().selectedItemProperty().addListener(ov -> {
            this.demoFont.setFontPhrase(theComboBox.getSelectionModel().getSelectedItem());
            this.mainDisplayText.setText(this.demoFont.getFontPhrase());
        });       
    }
    
    /**
     * Helper method to bring Slider components to the user interface
     */
    private void getSliderComponents() {
        this.demoFont.setFontName(this.fontNames[0]);
        this.demoFont.setFontPhrase(this.phraseTexts[0]);
        this.demoFont.setFontSize(24);
        
        this.mainDisplayText = new Label(this.demoFont.getFontPhrase());
        this.mainDisplayText.setFont(new Font(this.demoFont.getFontName(), (int) this.demoFont.getFontSize()));
        add(this.mainDisplayText, 0, 5);
	
        Slider sliderHorizontal = new Slider();

        sliderHorizontal.setShowTickLabels(true);
        sliderHorizontal.setShowTickMarks(true);
        sliderHorizontal.setValue(24);
        sliderHorizontal.setMin(10);
        sliderHorizontal.setMax(48);
        sliderHorizontal.setMajorTickUnit(10);
        sliderHorizontal.setMinorTickCount(4);
        
        add(new Label("Font Size: "), 0, 3);
        add(sliderHorizontal, 0, 4);

        sliderHorizontal.valueProperty().addListener(ov -> {
    		this.demoFont.setFontSize((int) sliderHorizontal.getValue());
    		this.mainDisplayText.setFont(new Font(this.demoFont.getFontName(), (int) this.demoFont.getFontSize()));
    	});        
    }
}
