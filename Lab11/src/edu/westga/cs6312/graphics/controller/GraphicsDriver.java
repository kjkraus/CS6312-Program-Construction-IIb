package edu.westga.cs6312.graphics.controller;

import edu.westga.cs6312.graphics.view.DrawingGUI;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class will execute the graphical user interface.
 * 
 * @author Kent Kraus
 * @version 2018-04-01
 *
 */
public class GraphicsDriver extends Application {
    
    /**
     * Override the start method in the Application class
     * 
     * 	Set the Stage's title  
     *	Create a container holding the material to be shown  
     *	Use the container to create a Scene
     *	Set the Stage's Scene 
     *	Make the Stage visible 
     *	
     * 	Be sure to create a subclass of Pane to hold your graphical objects 
     */
    @Override
    public void start(Stage primaryStage) {
        DrawingGUI demoGUI = new DrawingGUI();
        //demoGUI.getThermometerPane();
        //Scene thermometerScene = new Scene(demoGUI.getThermometerPane());
        Button btOK = new Button("OK");
        Scene thermometerScene = new Scene(btOK, 200, 250);
        primaryStage.setTitle("CS6312 Lab 11 - Thermometer");
        primaryStage.setScene(thermometerScene);
        primaryStage.show();
    }
    
    /**
     * This is the entry point for the application. It creates an instance of DrawingGUI
     *  and uses it to call getThermometerPane
     *  
     * @param args	Command-line arguments, not used
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
}
