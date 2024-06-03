public class variabletutorial { // Define a public class named 'variabletutorial'
    public static void main(String[] args) { // Main method, the entry point of the program

        // Declare an integer variable 'x'
        int x; // This is called a declaration, where we declare the type and name of the variable
        x = 123; // This is called an assignment, where we assign a value to the declared variable

        // Combine declaration and assignment into one single operation called initialization
        int a = 124; // This is an example of initialization, where we declare and assign in one step

        // Print a message to the console
        System.out.println("This is how we normally type a message");

        // Print the value of 'x' by including it in the output statement
        System.out.println("If we want to print int x, you can do so by adding a plus outside of the quotes, then the variable name. So here you should see the value of x: " + x);

        // Declare and initialize different types of variables

        // A float or double stores decimal numbers, integers cannot
        double b = 1.23; // Example of a double, which can store decimal numbers

        // A boolean can store true or false values
        boolean c = true; // Example of a boolean variable storing the value 'true'

        // A char stores a single character, enclosed in single quotes
        char d = 'd'; // Example of a char variable storing the character 'd'

        // A String stores a sequence of characters (text)
        // Strings start with a capital 'S' because it is a reference data type
        String name = "Rick"; // Example of a String variable storing the text "Rick"

        // Print a message including the String variable 'name'
        System.out.println("Hello " + name);

        // Print the values of the different variables to the console
        System.out.println(x); // Prints the value of 'x'
        System.out.println(a); // Prints the value of 'a'
        System.out.println(b); // Prints the value of 'b'
        System.out.println(c); // Prints the value of 'c'
        System.out.println(d); // Prints the value of 'd'

    }
}
