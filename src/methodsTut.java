public class methodsTut { // Define a public class named 'methodsTut'

    public static void main(String[] args) { // Main method, the entry point of the program

        // A method is a block of code that is executed when called upon

        String name = "Rick"; // Declare a String variable 'name' and assign it the value "Rick"
        int age = 21; // Declare an int variable 'age' and assign it the value 21

        hello(name, age); // Call the 'hello' method with 'name' and 'age' as arguments
    }

    // Define a static method named 'hello' that takes a String 'name' and an Integer 'age' as parameters
    // A static method belongs to the class rather than instances of the class.
    // This means it can be called without creating an object of the class.
    // We use a static method here because the main method is also static, and static methods can directly call other static methods.
    static void hello(String name, Integer age) {
        // Print a greeting message using the 'name' parameter
        System.out.println("Hello " + name);
        // Print the age message using the 'age' parameter
        System.out.println("You're " + age + " years old");
    }
}
