package edu.westga.cs6312.ui.view;

import edu.westga.cs6312.ui.model.Font;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
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
    private String[] fontNames = {"Arial", "Consolas", "FreeStyle Script", "System Bold"};
    private String[] phraseTexts = {"I love JavaFx", "I can't wait for Summer", "Go Wolves"};
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
        //VBox verticalGroup = new VBox();
        //verticalGroup.setMaxWidth(100);
        //add(new Label("Font: "), 0, 0);
        ListView<String> theListView = new ListView<>(FXCollections.observableArrayList(this.fontNames));
        theListView.setPrefSize(200, 200);
        theListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        theListView.getSelectionModel().select(0);
        add(theListView, 0, 0);
        
    }
    
    /**
     * Helper method to bring ComboBox components to the user interface
     */
    private void getComboBoxComponents() {
        //add(new Label("Text: "), 1, 0);
        ComboBox<String> theComboBox = new ComboBox<>();
        theComboBox.setPrefWidth(200);
        theComboBox.setValue("I love JavaFX");
        add(theComboBox, 2, 0);
    	
        ObservableList<String> comboBoxItems = FXCollections.observableArrayList(this.phraseTexts);
        theComboBox.getItems().addAll(comboBoxItems);
       
    }
    
    /**
     * Helper method to bring Slider components to the user interface
     */
    private void getSliderComponents() {
        Slider sliderHorizontal = new Slider();
        sliderHorizontal.setShowTickLabels(true);
        sliderHorizontal.setShowTickMarks(true);
        add(sliderHorizontal, 0, 4);
        
        this.selectedText = new Text(10, 50, "I love JavaFX");
        add(new Label("Font Size: "), 0, 3);
        add(this.selectedText, 2, 5);
        //Pane paneForText = new Pane();
        //paneForText.getChildren().add(this.selectedText);
        
        //BorderPane textAndSliderPane = new BorderPane();
        //textAndSliderPane.setCenter(paneForText);
        //textAndSliderPane.setBottom(sliderHorizontal);
        
        //sliderHorizontal.valueProperty().addListener(ov ->
        //	this.selectedText.setFont(sliderHorizontal.getValue()));
    }
    
}
