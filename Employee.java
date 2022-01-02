/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplereporter;

/**
 * This class stores the employee's information
 * @author Nick
 */
public class Employee {
    
    // Create private variables for the employees name and email
    private String firstName;
    private String lastName;
    private String Email;

    /**
     * This constructor takes 3 String inputs firstName, lastName, and Email
     * @param firstName the first name of the employee
     * @param lastName the last name of the employee
     * @param Email the email of the employee
     */
    public Employee(String firstName, String lastName, String Email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;
    }
    
    /**
     * This method returns the value in the firstName field
     * @return the value of firstName
     */
    public String getFirstName(){
        return firstName;
    }
    
    /**
     * This method returns the value in the lastName field
     * @return the value of lastName
     */
    public String getLastName(){
        return lastName;
    }
    
    /**
     * This method returns the value in the Email field
     * @return the value of Email
     */
    public String getEmail(){
        return Email;
    }
    
    /**
     * The setFirstName method stores a value in the firstName field
     * @param firstName the value to store in firstName 
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    /**
     * The lastName method stores a value in the lastName field
     * @param lastName the value to store in lastName 
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    /**
     * The setEmail method stores a value in the Email field
     * @param Email the value to store in Email 
     */
    public void setEmail(String Email){
        this.Email = Email;
    }
}
