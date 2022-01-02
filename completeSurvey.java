/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplereporter;

import samplereporter.sampleReporter.QualityBadge;

/**
 * This class combines the date, employees info, file parameters, and quality badge
 * @author Nick
 */
public class completeSurvey {
    
    
    private String Date;
    private Employee empInfo;
    private Parameters parameters;
    private int qBadge;

    /**
     * This constructor takes the date, employees info, the parameters of the file, and the type of badge
     * @param Date the date
     * @param empInfo all of the employees information
     * @param parameters all parameters of the file
     * @param qBadge the quality badge that is assigned to the file
     */
    public completeSurvey(String Date, Employee empInfo, Parameters parameters, QualityBadge qBadge) {
        this.Date = Date;
        this.empInfo = empInfo;
        this.parameters = parameters;
        this.qBadge = this.qBadge;
        
    }
    
    
    /**
     * The setDate method stores a value in the Date field
     * @param Date the value to store in Date
     */
    public void setDate(String Date) {
        this.Date = Date;
    }  
    
    /**
     * This method returns the value in the date field
     * @return the value Date
     */
    public String getDate(){
        return Date;
    }
    
    /**
     * The setEmployeeInfo method stores a value in the empInfo field
     * @param empInfo the value to store in empInfo
     */
    public void setEmployeeInfo(Employee empInfo){
        this.empInfo = empInfo;
    }
    
    /**
     * This method returns the value in the empInfo field
     * @return value of empInfo
     */
    public Employee getEmpInfo(){
        return empInfo;
    }
    
    /**
     * The setFirstName method stores a value in the firstName field
     * @param parameters the value to store in parameters
     */
    public void setParameters(Parameters parameters){
        this.parameters = parameters;
    }
    
    /**
     * This method returns the value in the parameters field
     * @return value in parameters
     */
    public Parameters getParameters(){
        return parameters;
    }
     
    /**
     * The setQBadge method stores a value in the qualityBadge field
     * @param qualityBadge value to store in qualityBadge
     */
    public void setQBadge(QualityBadge qualityBadge){
        this.qBadge = qBadge;
    }
    
    /**
     * This method returns the value in the qualityBadge field
     * @return value in qualityBadge
     */
    public int getQualityBadge(){
        return qBadge;
    }
}
