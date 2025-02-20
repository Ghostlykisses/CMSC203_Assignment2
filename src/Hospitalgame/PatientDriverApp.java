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

public class PatientDriverApp {
    public static void main(String[] args) {
        // Testing Patient class
        Patient patient1 = new Patient("John", "Doe", "Smith");
        patient1.setStreetAddress("123 Elm St.");
        patient1.setCity("Springfield");
        patient1.setState("IL");
        patient1.setZip("62701");
        patient1.setPhoneNumber("555-1234");
        patient1.setEmergencyContactName("Jane Smith");
        patient1.setEmergencyContactPhone("555-5678");

        // Display patient info
        System.out.println("Patient Info:");
        System.out.println("Name: " + patient1.getFirstName() + " " + patient1.getMiddleName() + " " + patient1.getLastName());
        System.out.println("Address: " + patient1.getStreetAddress() + ", " + patient1.getCity() + ", " + patient1.getState() + " " + patient1.getZip());
        System.out.println("Phone: " + patient1.getPhoneNumber());
        System.out.println("Emergency Contact: " + patient1.getEmergencyContactName() + " (" + patient1.getEmergencyContactPhone() + ")");

        // Create three procedures
        Procedure procedure1 = new Procedure("Appendectomy", "2025-02-20", "Dr. Smith", 5000.00);
        Procedure procedure2 = new Procedure("Knee Replacement", "2025-03-15", "Dr. Lee", 15000.00);
        Procedure procedure3 = new Procedure("Heart Bypass", "2025-04-10", "Dr. Johnson", 30000.00);

        // Display procedure info
        System.out.println("\nProcedure Info:");
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate total charges
        double totalCharges = procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
        System.out.println("\nTotal Charges for All Procedures: $" + totalCharges);
    }

    // Method to display procedure details
    public static void displayProcedure(Procedure procedure) {
        System.out.println("Procedure: " + procedure.getProcedureName());
        System.out.println("Date: " + procedure.getProcedureDate());
        System.out.println("Practitioner: " + procedure.getPractitionerName());
        System.out.println("Charges: $" + procedure.getCharges());
    }
}
