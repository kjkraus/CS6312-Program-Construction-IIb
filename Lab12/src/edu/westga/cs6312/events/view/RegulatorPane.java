package edu.westga.cs6312.events.view;

import edu.westga.cs6312.events.model.Regulator;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * This class will manage the code that draws the regulator GUI
 * 
 * @author Kent Kraus
 * @version 2018-04-08
 *
 */
public class RegulatorPane extends GridPane {
    private Regulator demoRegulator;
    private Label currentValue;
    private TextField startingValue;
    
    /**
     * 1-parameter constructor  that accepts a Regulator
     * 
     * @param	givenRegulator	Regulator with the data for the drawing
     */
    public RegulatorPane(Regulator givenRegulator) {
        this.demoRegulator = givenRegulator;
        this.setRegulatorPaneProperties();
        this.getStartingValueComponents();
        this.getCurrentValueComponents();
    }
    
    /**
     * Helper method to set the properties of the user interface
     */
    public void setRegulatorPaneProperties() {
        setAlignment(Pos.CENTER);
        setPadding(new Insets(5, 5, 5, 5));
        add(new TextField(), 1, 0);
        setHgap(3.5);
        setVgap(1.5);
    }
    
    /**
     * Helper method to bring starting value components to the user interface
     */
    public void getStartingValueComponents() {
        add(new Label("Starting value: "), 0, 0);
        add(new TextField(), 1, 0);
        Button setButton = new Button("Set");
        add(setButton, 2, 0);
    }
    
    /**
     * Helper method to bring current value components to the user interface
     */
    public void getCurrentValueComponents() {
        Button incrementButton = new Button("Increment");
        Button decrementButton = new Button("Decrement");
        add(incrementButton, 1, 2);
        add(decrementButton, 1, 3);
        add(new Label("Current value: " + this.demoRegulator.getCurrentRegulatorSetting()), 2, 2);
    }
}
