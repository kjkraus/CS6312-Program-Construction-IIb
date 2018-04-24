package edu.westga.cs6312.stock.controller;

import edu.westga.cs6312.stock.model.StockManager;

/**
 * This class manages adding records from a file 
 * 
 * @author Kent Kraus
 * @version 2018-04-23
 */
public class FileInteractor {
    
    /**
     * 0-parameter constructor to create the FileInteractor object
     */
    public FileInteractor() { 
	
    } 
    
    /**
     * Open a file of the specified name, read the data, and populate a StockManager object
     * 
     * @param fileName	the name of the file
     * @return 	stockManagerWithData
     */
    public static StockManager readData(String fileName) {
	//Add file management code here
        return stockManagerWithData;
    }
}
