/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplereporter;
import java.util.*;
import java.io.*;



/**
 * This class displays the employee's info, date, file parameters, and type of quality badge
 * @author Nick
 */
public class sampleReporter {
    
    enum QualityBadge{DISASTER, TERRIBLE, BAD, NEUTRAL, GOOD, SUBLIME};
    

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        
        // Create scanner to take in employee info
        Scanner infoScan = new Scanner(System.in);
        
        // Create employee info variables
        String firstName;
        String lastName;
        String Email;
        String Date;
                
        // Ask the employee for their info
        System.out.println("Welcome to the Water Sample Reporter!");
        System.out.print("Please enter the employee's first name: ");
        firstName = infoScan.nextLine();
        System.out.print("Please enter the employee's last name: ");
        lastName = infoScan.nextLine();
        System.out.print("Please enter the employee's email: ");
        Email = infoScan.nextLine();
        System.out.print("Please enter today's date in YYYY-MM-DD format: ");
        Date = infoScan.nextLine();
        
        
      
       
       //Create Scanner to scan water sample file
       Scanner fileScan = new Scanner(System.in);
       Scanner inputFile = new Scanner(System.in);
       
       //Ask the employee to enter the file name to be read
        System.out.print("Enter your Super Water Sampler file to be read: ");
        String filename = fileScan.nextLine();
        
        //Create an Employee object
        Employee empInfo = new Employee(firstName, lastName, Email);
        System.out.println("----------------------------------Employee Info--------------------------------------");
        System.out.println("Date: " + Date + "\n"
                          + "Name: " + empInfo.getFirstName() + " " + empInfo.getLastName() + "\n"
                          + "Email: " + empInfo.getEmail()
                          );
        System.out.println("---------------------------------Water Sample Data-----------------------------------");
        
        
        //Create a File object
        File file = new File(filename);
        inputFile = new Scanner(file);
        //Store contents of file into an Array
        int counter = (int) 0.0;
        int numOutOfRange = 0;
        while (inputFile.hasNext()){
            String data = inputFile.nextLine();
            String[] values = data.split(",");
            //Check to see how many parameters are out of range
            String names = values[0];
            double value = Double.parseDouble(values[1]);
            double startRange = Double.parseDouble(values[2]);
            double endRange = Double.parseDouble(values[3]);
            //Create parameter object
            Parameters p = new Parameters(names, value, startRange, endRange);
            System.out.println(names + " " + value + " " + startRange + " " +  endRange);
            if(value < startRange || value > endRange){
                counter++;
                numOutOfRange = counter;
            }      
        }
        inputFile.close();
        
        
        //Award a quality badge based on number of parameters out of range
        if(numOutOfRange == 0){
            QualityBadge SUBLIME = QualityBadge.SUBLIME;
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Quality Badge: " + SUBLIME);
        }
        else if(numOutOfRange == 1){
           QualityBadge GOOD = QualityBadge.GOOD;
           System.out.println("---------------------------------------------------------------------");
           System.out.println("Quality Badge: " + GOOD);
        }
        else if(numOutOfRange == 2){
        QualityBadge NEUTRAL = QualityBadge.NEUTRAL;
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Quality Badge: " + NEUTRAL);
        }
        else if(numOutOfRange == 3){
            QualityBadge BAD = QualityBadge.BAD;
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Quality Badge: " + BAD);
        }
        else if(numOutOfRange == 4){
            QualityBadge TERRIBLE = QualityBadge.TERRIBLE;
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Quality Badge: " + TERRIBLE);
        }
        else if(numOutOfRange >= 5){
            QualityBadge DISASTER = QualityBadge.DISASTER;
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Quality Badge: " + DISASTER);
        }

        
    }
    


}
