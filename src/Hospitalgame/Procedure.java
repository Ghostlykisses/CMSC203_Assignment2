/**
 * Class: CMSC203 31843
 * Instructor:Ashique Tanveer
 * Description: It is a Java application created to manage patient information and medical procedures using classes for Patient, Procedure, and a driver class to display data and calculate total charges. 
 * Due: 02/24/2025
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here:Bervelyn Tetteh
 */

package Hospitalgame;

public class Procedure {
    private String procedureName, procedureDate;
    private String practitionerName;
    private double charges;

    // No-arg constructor
    public Procedure() {}

    // Constructor for procedure name and date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    // Constructor for all attributes
    public Procedure(String procedureName, String procedureDate,
                     String practitionerName, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

    // Getters and Setters
    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public String getProcedureDate() {
        return procedureDate;
    }

    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }
}
