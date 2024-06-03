import java.util.Scanner; // Import the Scanner class from the java.util package

public class logicaloperatiorstut { // Define a public class named 'logicaloperatiorstut'

    public static void main(String[] args) { // Main method, the entry point of the program

        // Logical operators are used to connect two or more expressions.
        // && (AND): Both conditions must be true.
        // || (OR): Either condition must be true.
        // ! (NOT): Reverses the boolean value of the condition.

        // Example for &&
        int temp = 76; // Define a variable 'temp' and assign it the value 76
        if (temp > 90) { // If 'temp' is greater than 90
            System.out.println("It is hot outside!"); // Print "It is hot outside!"
        } else if (temp >= 75 && temp <= 90) { // If 'temp' is between 75 and 90 (inclusive)
            System.out.println("It's nice outside!"); // Print "It's nice outside!"
        } else { // If none of the above conditions are true
            System.out.println("It is cold outside"); // Print "It is cold outside"
        }
    }
}


//        Example for ||
//
//
//        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input from the console
//
//        System.out.println("You're playing a game. Press Q or q to quit."); // Prompt the user to input 'Q' or 'q'
//        String response = scanner.next(); // Read the user's input
//
//        if (response.equals("q") || response.equals("Q")) { // Check if the user input is either 'q' or 'Q'
//            System.out.println("You're such a quitter. Don't give up just because you're too lazy to do anything!"); // If true, print a message indicating the user is quitting
//        } else { // If the user input is not 'q' or 'Q'
//            System.out.println("Keep going, I'll just make it harder!"); // Print a message to encourage the user to keep playing
//        }
//    }
//}


//  Example for !
//
//        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input from the console
//
//        System.out.println("You're playing a game. Press Q or q to quit."); // Prompt the user to input 'Q' or 'q'
//        String response = scanner.next(); // Read the user's input
//
//        if (!response.equals("q") && !response.equals("Q")) { // Check if the user input is neither 'q' nor 'Q'
//            System.out.println("Keep going, I'll just make it harder!"); // If true, print a message to encourage the user to keep playing
//        } else { // If the user input is 'q' or 'Q'
//            System.out.println("You're such a quitter. Don't give up just because you're too lazy to do anything!"); // Print a message indicating that the user is quitting
//        }
//    }
//}