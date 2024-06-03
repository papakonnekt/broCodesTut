public class swapingvariables { // Define a public class named 'swapingvariables'
    public static void main(String[] args) { // Main method, the entry point of the program

        // Declare and initialize two String variables
        String x = "water"; // Variable 'x' is initialized to the value "water"
        String y = "kool-aid"; // Variable 'y' is initialized to the value "kool-aid"
        String temp; // Declare a temporary String variable 'temp'

        // Swap the values of 'x' and 'y' using the temporary variable 'temp'
        temp = x; // Store the value of 'x' in 'temp'
        x = y; // Assign the value of 'y' to 'x'
        y = temp; // Assign the value of 'temp' (which holds the original value of 'x') to 'y'

        // Print the swapped values of 'x' and 'y'
        System.out.println("x: " + x); // Output the value of 'x' after the swap
        System.out.println("y: " + y); // Output the value of 'y' after the swap
    }
}
