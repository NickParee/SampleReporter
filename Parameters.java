/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplereporter;

/**
 * This class stores the files parameters
 * @author Nick
 */
public class Parameters {
    
    // Create private variables for each parameter
    private String name;
    private double value;
    private double startRange;
    private double endRange;

    /**
     * This constructor takes in the inputs of a name String, value a float, startRange a float, and endRange a float
     * @param name the name of the parameter
     * @param value value of the parameter
     * @param startRange start of the target interval
     * @param endRange end of the target interval
     */
    public Parameters(String name, double value, double startRange, double endRange) {
        this.name = name;
        this.value = value;
        this.startRange = startRange;
        this.endRange = endRange;
    }

   
    
    
    /**
     * This method returns the value in the name field 
     * @return the value of name
     */
    public String getName(){
        return name;
    }
    
    /**
     * This method returns the value in the value field
     * @return the value of value
     */
    public double getValue(){
        return value;
    }
    
    /**
     * This method returns the value in the startRange field
     * @return the value of startRange
     */
    public double getStartRange(){
        return startRange;
    }
    
    /**
     * This method returns the value in the endRange field
     * @return the value of endRange
     */
    public double getEndRange(){
        return endRange;
    }
    
    /**
     * The setName method stores a value in the name field
     * @param name the value to store in name 
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * The setValue method stores a value in the value field
     * @param value the value to store in value 
     */
    public void setValue(double value){
        this.value = value;
    }
    
    /**
     * The setStartRange method stores a value in the startRange field
     * @param startRange the value to store in startRange 
     */
    public void setStartRange(double startRange){
        this.startRange = startRange;
    }
    
    /**
     * The setEndRange method stores a value in the endRange field
     * @param endRange the value to store in endRange
     */
    public void setEndRange(double endRange){
        this.endRange = endRange;
    }
}
