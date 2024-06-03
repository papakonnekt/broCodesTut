import java.util.Scanner; // Import the Scanner class from the java.util package

// The following program finds the hypotenuse of a triangle
public class mathclasstut {
    public static void main(String[] args) { // Main method, the entry point of the program
        double x; // Declare a variable 'x' to store the length of side x
        double y; // Declare a variable 'y' to store the length of side y
        double z; // Declare a variable 'z' to store the length of the hypotenuse

        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input from the console

        System.out.println("Enter side x: "); // Prompt the user to enter the length of side x
        x = scanner.nextDouble(); // Read the user's input and store it in the variable 'x'

        System.out.println("Enter side y: "); // Prompt the user to enter the length of side y
        y = scanner.nextDouble(); // Read the user's input and store it in the variable 'y'

        // Calculate the length of the hypotenuse using the Pythagorean theorem: sqrt(x^2 + y^2)
        z = Math.sqrt((x * x) + (y * y)); // Use the Math.sqrt() method to calculate the square root

        System.out.println("The hypotenuse is " + z); // Print the length of the hypotenuse

        scanner.close(); // Close the Scanner object to release system resources
    }
}
