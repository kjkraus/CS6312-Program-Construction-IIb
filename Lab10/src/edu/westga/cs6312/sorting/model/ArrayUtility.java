package edu.westga.cs6312.sorting.model;

import java.util.Random;

/**
 * This class models a utility with different methods to generate and manipulate simple arrays
 *  of integers
 * 
 * @author Kent Kraus
 * @version 2018-03-20
 */
public class ArrayUtility {
    private Random numberGenerator;
    
    /**
     * 0-parameter constructor to create the ArrayUtility object
     */
    public ArrayUtility() {
        this.numberGenerator = new Random();
    }
    
    /**
     * Creates an integer array of a certain size and populates it with random numbers
     *  between the minimum and maximum integer values
     * 
     * @param size	the size of the array
     * @return	integer array
     */
    public int [] createArray(int size) {
        int[] integerArray = new int[size];
        for (int counter = 0; counter < size; counter++) {
    	    integerArray[counter] = this.numberGenerator.nextInt();
        }
        return integerArray;
    }  
    
    /**
     * Returns true if and only if the elements in the array are in 
     *  non-increasing order
     *  
     *  @param	theArray	an integer array
     *  @return boolean	true if elements are in non-increasing order
     */
    public boolean isInNonIncreasingOrder(int [] theArray) {
        return false;
    }
    
    /**
     * Swaps the values stored in the array at indexes index1 and index2
     * 
     * @param 	theArray	an integer array
     * @param	index1	value for element stored at a specific place in the integer array	
     * @param  	index2	value for element stored at a specific place in the integer array	 	
     */
    public void swapElements(int index1, int index2, int []theArray) {
	
    }
    
    /**
     * Create a new array, copy each element from theArray and store it in the corresponding
     *  index in the new array
     *  
     *  @param	theArray	an integer array
     *  @return newArray	the new array with each elements copied from theArray
     */
    public int [] copyArray(int[] theArray) {
        int[] newArray = new int[theArray.length];
        return newArray;
    }
    
    /**
     * Sorts the elements in theArray into non-increasing order using the selection sort
     *  algorithm
     *  
     *  @param	theArray 	an integer array
     */
    public void selectionSort(int [] theArray) {
	
    }
    
    /**
     * Sorts the elements in theArray into non-increasing order using the merge sort
     *  algorithm
     *  
     *  @param	theArray 	an integer array
     */
    public void mergeSort(int [] theArray) {
        if (theArray == null) {
        	throw new NullPointerException("The array cannot be null.");
        }
        if (theArray.length == 0) {
        	throw new IllegalArgumentException("The array cannot be zero-length.");
        }
    }
}
