import java.util.Scanner; // Import the Scanner class from the java.util package

public class whileloops { // Define a public class named 'whileloops'
    public static void main(String[] args) { // Main method, the entry point of the program

        // while loop = executes a block of code as long as a condition remains true

        Scanner scanner = new Scanner(System.in); // Create a new Scanner object to read input from the console
        String name = ""; // Declare a String variable 'name' and initialize it with an empty string

        // Execute the code block inside the while loop as long as the condition 'name.isBlank()' remains true
        // 'name.isBlank()' checks if the 'name' variable is empty or contains only whitespace
        while (name.isBlank()) { // Start of the while loop
            System.out.print("Enter your name: "); // Prompt the user to enter their name
            name = scanner.nextLine(); // Read the user's input and store it in the 'name' variable
        } // End of the while loop

        System.out.println("Hello " + name); // Print a greeting message including the user's name

    } // End of the main method
} // End of the whileloops class
