import java.util.Scanner; // Import the Scanner class from the java.util package

public class nestedloopstut { // Define a public class named 'nestedloopstut'

    public static void main(String[] args) { // Main method, the entry point of the program

        // nested loops are loops inside of another loop

        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input from the console
        int rows; // Declare a variable to store the number of rows
        int columns; // Declare a variable to store the number of columns
        String symbol = ""; // Declare a variable to store the symbol to use

        // Prompt the user to enter the number of rows
        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt(); // Read the user's input for the number of rows

        // Prompt the user to enter the number of columns
        System.out.println("Enter number of columns: ");
        columns = scanner.nextInt(); // Read the user's input for the number of columns

        // Prompt the user to enter the symbol to use
        System.out.println("Enter symbol to use:");
        symbol = scanner.next(); // Read the user's input for the symbol to use

        // Outer loop for rows
        for(int i = 1; i <= rows; i++){ // Iterate over each row
            System.out.println(); // Move to the next line for each new row

            // Inner loop for columns
            for(int j = 1; j <= columns; j++){ // Iterate over each column in the current row
                System.out.print(symbol); // Print the symbol for each column
            }
        }

        scanner.close(); // Close the Scanner object to release system resources
    }
}
