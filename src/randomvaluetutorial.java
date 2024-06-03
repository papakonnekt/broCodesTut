import java.util.Random; // Import the Random class from the java.util package

public class randomvaluetutorial { // Define a public class named 'randomvaluetutorial'

    public static void main(String[] args) { // Main method, the entry point of the program

        Random random = new Random(); // Create a Random object to generate random values

        // Generate a random integer between 1 and 6 (inclusive), simulating a roll of a six-sided die
        int x = random.nextInt(6) + 1;
        // The above code generates a random integer from 0 to 5 (nextInt(6)), then adds 1 to shift the range to 1 to 6.
        // This simulates rolling a six-sided die, where each side is represented by a number from 1 to 6.
        // Adding 1 ensures that the minimum value is 1, preventing a roll of 0, which is the default starting value for many random number generators.

        // Generate a random double between 0.0 and 1.0
        double y = random.nextDouble();

        // Generate a random boolean value (true or false)
        boolean z = random.nextBoolean();

        // Print the generated boolean value
        System.out.println(z);
    }
}
