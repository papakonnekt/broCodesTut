import java.util.Scanner; // Import the Scanner class from the java.util package

public class userinputtut { // Define a public class named 'userinputtut'
    public static void main(String[] args) { // Main method, the entry point of the program

        // Create a new Scanner object to read input from the console
        // 'Scanner' is the class, 'scanner' is the name we give to our Scanner object
        // 'new Scanner(System.in)' creates a new Scanner that reads from the standard input (keyboard)
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.println("What is your name? ");
        String name = scanner.nextLine(); // Read the user's name as a string

        // Prompt the user to enter their age
        System.out.println("How old are you? ");
        int age = scanner.nextInt(); // Read the user's age as an integer

        // Clears the scanner buffer
        scanner.nextLine(); // Call nextLine() to consume the newline character left by nextInt()

        // Greet the user and display their age
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old!");

        // Prompt the user to enter their favorite food
        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine(); // Read the user's favorite food as a string

        // Display a message about the user's favorite food
        System.out.println("I love " + food + " too!");

        // Close the scanner to free up resources
        scanner.close();
    }
}
