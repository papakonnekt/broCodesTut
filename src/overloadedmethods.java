public class overloadedmethods { // Define a public class named 'overloadedmethods'

    public static void main(String[] args) { // Main method, the entry point of the program

        // overloaded methods share the same name but have different parameters

        double x = add(1.0, 2.0, 3.0, 4.1); // Call the overloaded 'add' method with four double arguments
        System.out.println(x); // Print the result returned by the method

    }

    // Method 1: Add two integers
    static int add(int a, int b) { // Method signature for adding two integers
        System.out.println("This is overloaded method #1"); // Print a message indicating which method is being executed
        return a + b; // Return the sum of the two integers
    }

    // Method 2: Add three integers
    static int add(int a, int b, int c) { // Method signature for adding three integers
        System.out.println("This is overloaded method #2"); // Print a message indicating which method is being executed
        return a + b + c; // Return the sum of the three integers
    }

    // Method 3: Add four integers
    static int add(int a, int b, int c, int d) { // Method signature for adding four integers
        System.out.println("This is overloaded method #3"); // Print a message indicating which method is being executed
        return a + b + c + d; // Return the sum of the four integers
    }

    // Method 4: Add two doubles
    static double add(double a, double b) { // Method signature for adding two doubles
        System.out.println("This is overloaded method #4"); // Print a message indicating which method is being executed
        return a + b; // Return the sum of the two doubles
    }

    // Method 5: Add three doubles
    static double add(double a, double b, double c) { // Method signature for adding three doubles
        System.out.println("This is overloaded method #5"); // Print a message indicating which method is being executed
        return a + b + c; // Return the sum of the three doubles
    }

    // Method 6: Add four doubles
    static double add(double a, double b, double c, double d) { // Method signature for adding four doubles
        System.out.println("This is overloaded method #6"); // Print a message indicating which method is being executed
        return a + b + c + d; // Return the sum of the four doubles
    }
}
