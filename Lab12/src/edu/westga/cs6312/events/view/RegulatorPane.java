package edu.westga.cs6312.events.view;

import edu.westga.cs6312.events.model.Regulator;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

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
    private void setRegulatorPaneProperties() {
        setAlignment(Pos.CENTER);
        setPadding(new Insets(5, 5, 5, 5));
        setHgap(3.5);
        setVgap(3.5);
    }
    
    /**
     * Helper method to bring starting value components to the user interface
     */
    private void getStartingValueComponents() {
        add(new Label("Starting value: "), 0, 0);
        this.startingValue = new TextField();
        add(this.startingValue, 1, 0);
        Button setButton = new Button("Set");    
        add(setButton, 2, 0);
        setButton.setOnAction(new SetHandler());
    }
    
    /**
     * Helper method to bring current value components to the user interface
     */
    private void getCurrentValueComponents() {
        VBox verticalGroup = new VBox();
        verticalGroup.setMaxWidth(100);
        
        Button incrementButton = new Button("Increment");
        Button decrementButton = new Button("Decrement");
        incrementButton.setMaxWidth(100);
        decrementButton.setMaxWidth(100);
        
        this.currentValue = new Label("Current value: " + this.demoRegulator.getCurrentRegulatorSetting());
        add(this.currentValue, 2, 2);
        
        verticalGroup.getChildren().addAll(incrementButton, decrementButton);
        add(incrementButton, 1, 2);
        add(decrementButton, 1, 3);
        incrementButton.setOnAction(new IncrementHandler());
        decrementButton.setOnAction(new DecrementHandler());
    }
    
    /**
     * Handler class to create a handler object for the Set button
     * 
     * @author Kent Kraus
     * @version 2018-04-08
     */
    private class SetHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent setEvent) {
            RegulatorPane.this.demoRegulator.setCurrentRegulatorSetting(RegulatorPane.this.getUserInputValue());
            RegulatorPane.this.startingValue.setText(Integer.toString(RegulatorPane.this.getUserInputValue()));
            RegulatorPane.this.currentValue.setText("Current value: " 
        	    + RegulatorPane.this.getUserInputValue());
        }
	
    }
    
    /**
     * Handler class to create a handler object for the Increment button
     * 
     * @author Kent Kraus
     * @version 2018-04-08
     */
    private class IncrementHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent incrementEvent) {
            RegulatorPane.this.demoRegulator.increment();
            RegulatorPane.this.currentValue.setText("Current value: " 
        	    + RegulatorPane.this.demoRegulator.getCurrentRegulatorSetting());
        }
	
    }
    
    /**
     * Handler class to create a handler object for the Decrement button
     * 
     * @author Kent Kraus
     * @version 2018-04-08
     */
    private class DecrementHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent decrementEvent) {
            RegulatorPane.this.demoRegulator.decrement();
            RegulatorPane.this.currentValue.setText("Current value: " 
        	    + RegulatorPane.this.demoRegulator.getCurrentRegulatorSetting());
        }
	
    }
    
    /**
     * Parses user input from the text field and returns an integer
     * 
     * @return	userSelection	the integer value given by the user
     */
    private int getUserInputValue() {
    	int userSelection = 0;
    	try {
    	    userSelection = Integer.parseInt(RegulatorPane.this.startingValue.getText());
    	} catch (NumberFormatException nfe) {
    	    userSelection = 0;
    	} catch (IllegalArgumentException iae) {
    	    userSelection = 0;
    	} 
    	return userSelection;
    }
    
}
