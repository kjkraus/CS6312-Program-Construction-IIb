package edu.westga.cs6312.events.controller;

import edu.westga.cs6312.events.model.Regulator;
import edu.westga.cs6312.events.view.RegulatorPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class will execute the graphical user interface.
 * 
 * @author Kent Kraus
 * @version 2018-04-08
 *
 */
public class EventDriver extends Application {
    
    /**
     * Override the start method in the Application class
     * 
     * 	Set the Stage's title  
     *	Create a container holding the material to be shown  
     *	Use the container to create a Scene
     *	Set the Stage's Scene 
     *	Make the Stage visible 
     */
    @Override
    public void start(Stage primaryStage) {
        Regulator demoRegulator = new Regulator();
        RegulatorPane demoGUI = new RegulatorPane(demoRegulator);
        Scene regulatorScene = new Scene(demoGUI, 500, 200);
        primaryStage.setTitle("CS6312 Lab 12 - Regulator");
        primaryStage.setScene(regulatorScene);
        primaryStage.show();
    }
    
    /**
     * This is the entry point of the application. It calls an instance of Regulator Pane.
     * 
     * @param args	Command-line arguments, not used
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

}
