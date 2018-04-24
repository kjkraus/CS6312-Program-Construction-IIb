package edu.westga.cs6312.stock.controller;

import java.util.Scanner;

import edu.westga.cs6312.stock.model.StockManager;
import edu.westga.cs6312.stock.view.StockTUI;

/**
 * This class manages version choice of the data file functionality
 * 
 * @author Kent Kraus
 * @version 2018-04-23
 */
public class VersionChooser {
    private Scanner input;
    private StockManager collectionOfStockData;
    
    /**
     * 0-parameter constructor that creates VersionChooser object
     */
    public VersionChooser() {
        this.input = new Scanner(System.in);
    }
    
    /**
     * Helper method prompt user for file name, create file interactor, and execute the text option
     *   the application
     */
    public void chooseVersion() {
        String fileName = this.getFileName();
        FileInteractor.readData(fileName);
        this.runTextOption();
    }
    
    /**
     * This method runs the text option of StockTUI
     */
    private void runTextOption() {
        StockTUI demoTUI = new StockTUI(this.collectionOfStockData);
        demoTUI.run();
    }
    
    /**
     * This method will use the console to prompt the user for a file to be read and return the filename
     */
    private String getFileName() {
        //add file input code here --- see StockTUI code
        return "";
    }
}
