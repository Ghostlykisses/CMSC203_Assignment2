/**
 * Class: CMSC203 31843
 * Instructor:Ashique Tanveer
 * Description:  a driver program that tests the functionality of the Movie class.
 * Due: 02/24/2025
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here:Bervelyn Tetteh
 */


package Moviegamee;
import java.util.Scanner;

public class MovieDriver_Task2 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner keyboard = new Scanner(System.in);

        // Loop for multiple movie inputs
        boolean continueInput = true;
        while (continueInput) {
            // Create a new movie object
            Movie movie = new Movie();

            // Prompt the user to enter the title of a movie
            System.out.print("Enter the title of a movie: ");
            String title = keyboard.nextLine();
            movie.setTitle(title);

            // Prompt the user to enter the movie's rating
            System.out.print("Enter the movie's rating: ");
            String rating = keyboard.nextLine();
            movie.setRating(rating);

            // Prompt the user to enter the number of tickets sold
            System.out.print("Enter the number of tickets sold at a theater: ");
            int soldTickets = keyboard.nextInt();
            movie.setSoldTickets(soldTickets);

            // Print out the movie's information
            System.out.println(movie.toString());

            // Prompt the user if they want to enter another movie
            System.out.print("Do you want to enter another movie? (yes/no): ");
            String response = keyboard.next();
            keyboard.nextLine();  // Consume the newline character
            if (response.equalsIgnoreCase("no")) {
                continueInput = false;
            }
        }

        // Close the Scanner
        keyboard.close();
    }
}

