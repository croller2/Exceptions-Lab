package lab0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setDaysVacation(daysVacation);
    }
    
    public final int getDaysVacation() {
        return daysVacation;
    }
    //Validation rules:
    // not less than 0 and not more than 120
    public final void setDaysVacation(int daysVacation) throws IllegalArgumentException{
        if(daysVacation < 0 || daysVacation > 120){
            throw new IllegalArgumentException("Sorry vacation days must be between 0 and 120, inclusive");
        }else{
            this.daysVacation = daysVacation;
        }
        
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) throws IllegalArgumentException {
        Pattern p = Pattern.compile("[^a-zA-Z0-9]");
        Matcher m = p.matcher(firstName);        
        if(firstName == null || 
                firstName.length() < 1 || 
                firstName.length() > 50 || 
                firstName.isEmpty() || 
                m.find()){
            throw new IllegalArgumentException("First name must be between 1 and 50 characters in length and have no special characters");
        }else{
             this.firstName = firstName;
        }
    }

    public final String getLastName() {
        return lastName;
    }
    //Validation rules:
    // - no null
    // - no empty strings
    // - no special symbols
    // - length 1 or greater, less than equal to 50
    public final void setLastName(String lastName) throws IllegalArgumentException {
        Pattern p = Pattern.compile("[^a-zA-Z0-9]");
        Matcher m = p.matcher(lastName);        
        if(lastName == null || 
                lastName.length() < 1 || 
                lastName.length() > 50 || 
                lastName.isEmpty() || 
                m.find()){
            throw new IllegalArgumentException("Last name must be between 1 and 50 characters in length and have no special characters");
            
        }else{
          this.lastName = lastName;  
        }
        
    }

    public final String getSsn() {
        return ssn;
    }
    // Validation rules:
    // - all numbers
    // - not null
    // - no white space
    // - 9 characters in length
    public final void setSsn(String ssn) throws IllegalArgumentException {
        
        ssn = ssn.replaceAll( "[^\\d]", "" ); 
        if(ssn == null || ssn.length() != 9 ){
            throw new IllegalArgumentException("Social must have 9 numbers and no special characters");
        }else{
            this.ssn = ssn;
        }
    
        
    }
    
    public final String fullNameInCaps(){
       return this.lastName.toUpperCase() + " " + this.firstName.toUpperCase();
    }
    
    
    
}
