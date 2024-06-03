public class ifstatementtut { // Define a public class named 'ifstatementtut'

    public static void main(String[] args) { // Main method, the entry point of the program

        int age = 15; // Define a variable named 'age' and assign it the value 15

        if (age >= 75) { // Check if 'age' is greater than or equal to 75
            System.out.println("OK Boomer."); // If true, print "OK Boomer."
        } else if (age >= 18) { // If the previous condition is false, check if 'age' is greater than or equal to 18
            System.out.println("You are an adult!"); // If true, print "You are an adult!"
        } else if (age >= 13) { // If the previous conditions are false, check if 'age' is greater than or equal to 13
            System.out.println("You are a teen!"); // If true, print "You are a teen!"
        } else { // If all previous conditions are false
            System.out.println("You are a child! GTFO of here, fool!"); // Print "You are a child! GTFO of here, fool!"
        }
    }
}
