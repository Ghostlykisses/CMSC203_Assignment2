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

public class Testcasses {
    public static void main(String[] args) {
        // Case 1: Valid Input Test
        System.out.println("Case 1: Valid Input Test");
        testValidInput();

        // Case 2: Invalid Input Test (negative charges and invalid phone number)
        System.out.println("\nCase 2: Invalid Input Test");
        testInvalidInput();

        // Case 3: Edge Case (Zero charges for procedure)
        System.out.println("\nCase 3: Edge Case - Zero Charges");
        testZeroCharges();

        // Case 4: Incorrect Data Type (invalid charge data)
        System.out.println("\nCase 4: Incorrect Data Type Test");
        testIncorrectDataType();
    }

    // Test Case 1: Valid Input
    public static void testValidInput() {
        Patient patient1 = new Patient("John", "Doe", "Smith");
        patient1.setStreetAddress("123 Elm St.");
        patient1.setCity("Springfield");
        patient1.setState("IL");
        patient1.setZip("62701");
        patient1.setPhoneNumber("555-1234");
        patient1.setEmergencyContactName("Jane Smith");
        patient1.setEmergencyContactPhone("555-5678");

        Procedure procedure1 = new Procedure("Appendectomy", "2025-02-20", "Dr. Smith", 5000.00);
        displayProcedure(procedure1);
    }

    // Test Case 2: Invalid Input (negative charges and invalid phone number)
    public static void testInvalidInput() {
        Patient patient2 = new Patient("Invalid", "Test", "User");
        patient2.setPhoneNumber("555-12"); // Invalid phone number (too short)
        patient2.setEmergencyContactPhone("1234"); // Invalid phone number format

        Procedure procedure2 = new Procedure("Appendectomy", "2025-02-20", "Dr. Smith", -5000.00); // Invalid charge
        displayProcedure(procedure2);
    }

    // Test Case 3: Edge Case (Zero charges for procedure)
    public static void testZeroCharges() {
        Patient patient3 = new Patient("Zero", "Charges", "Test");
        patient3.setPhoneNumber("555-4321");
        patient3.setEmergencyContactPhone("555-8765");

        Procedure procedure3 = new Procedure("Routine Checkup", "2025-02-20", "Dr. Zero", 0.00); // Zero charges
        displayProcedure(procedure3);

        // Total charges should handle zero value
        double totalCharges = procedure3.getCharges();
        System.out.println("Total Charges for All Procedures: $" + totalCharges);
    }

    // Test Case 4: Incorrect Data Type (invalid charge data)
    public static void testIncorrectDataType() {
        try {
            Patient patient4 = new Patient("Test", "Incorrect", "Data");
            patient4.setPhoneNumber("555-0000");
            patient4.setEmergencyContactPhone("555-1111");

            // Simulating invalid data type for charges (e.g., "String" instead of a double)
            Procedure procedure4 = new Procedure("Emergency Surgery", "2025-02-20", "Dr. Error", Double.parseDouble("InvalidCharge")); // Will throw exception
            displayProcedure(procedure4);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid charge input (non-numeric value).");
        }
    }

    // Helper method to display procedure details
    public static void displayProcedure(Procedure procedure) {
        System.out.println("Procedure: " + procedure.getProcedureName());
        System.out.println("Date: " + procedure.getProcedureDate());
        System.out.println("Practitioner: " + procedure.getPractitionerName());
        System.out.println("Charges: $" + procedure.getCharges());
    }
}
