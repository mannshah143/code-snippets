// Import the Scanner class for user input
import java.util.Scanner;

// Define a class named Main
public class Main {
    // Main method
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their score
        System.out.print("Enter your score: ");

        // Read the input as an integer
        int score = scanner.nextInt();

        // Check if the score is between 90 and 100
        if (score >= 90 && score <= 100) {
            // If true, print that the student gets an A
            System.out.println("You got an A!");
        }
        // Check if the score is between 80 and 89
        else if (score >= 80 && score < 90) {
            // If true, print that the student gets a B
            System.out.println("You got a B.");
        }
        // Check if the score is between 70 and 79
        else if (score >= 70  && score < 80) {
            // If true, print that the student gets a C
            System.out.println("You got a C.");
        }
        // Check if the score is between 60 and 69
        else if (score >= 60  && score < 70) {
            // If true, print that the student gets a D
            System.out.println("You got a D.");
        }
        // Check if the score is between 0 and 59
        else if (score >= 0  && score < 60) {
            // If true, print that the student gets an F
            System.out.println("You got an F.");
        }
        // Check if the input score is out of the valid range of score allowed
        else {
            // Print to enter a valid score (between 0 and 100)
            System.out.println("Please enter a valid score.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}