package edu.westga.cs6312.stock.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import edu.westga.cs6312.stock.model.StockManager;
import edu.westga.cs6312.stock.model.StockRecord;

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
        File myFile = new File(fileName);
        Scanner inFile = null;
        StockManager stockManagerWithData = new StockManager();
        try {
            inFile = new Scanner(myFile);
            inFile.useDelimiter(", *");
            while (inFile.hasNext()) {
                String recordDate = (inFile.next());
        	//Manage comma delimited values to skip thru after closing price	    
                double closingPrice = (inFile.nextDouble());
                //double someValue = (inFile.nextInt());
                StockRecord nextRecord = new StockRecord(recordDate, closingPrice);
                stockManagerWithData.addRecord(nextRecord);
                inFile.close();
            }  
       	    //comment this out later if working
       	    for (StockRecord stock : stockManagerWithData.getRecords()) {
       			System.out.println("\t" + stock.toString());		    
       	    }
            inFile.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("\n\tFile not found. Try a valid file name.");
        } catch (NoSuchElementException nsee) {
            System.out.println("\n\tRead past the end of the file.");
            inFile.close();
        }
		return stockManagerWithData;
    }
}
