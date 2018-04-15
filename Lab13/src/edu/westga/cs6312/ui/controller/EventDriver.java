package edu.westga.cs6312.ui.controller;

import edu.westga.cs6312.ui.model.Font;
import edu.westga.cs6312.ui.view.FontPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class will execute the graphical user interface.
 * 
 * @author Kent Kraus 
 * @version 2018-04-14
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
        Font demoFont = new Font("Consolas", 24, "I love JavaFX");
        FontPane demoGUI = new FontPane(demoFont);
        Scene fontScene = new Scene(demoGUI, 600, 600);
        primaryStage.setTitle("CS6312 - Lab 13");
        primaryStage.setScene(fontScene);
        primaryStage.show();
    }
    
    /**
     * This is the entry point of the application. It calls an instance of Font Pane.
     * 
     * @param args	Command-line arguments, not used
     */
    public static void main(String[] args) {
        Application.launch(args);

    }

}
