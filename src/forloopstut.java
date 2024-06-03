public class forloopstut { // Define a public class named 'forloopstut'

    public static void main(String[] args) { // Main method, the entry point of the program

        // A for loop executes a block of code a limited number of times.

        // Example 1: Counting to ten
        // Uncomment the code below to count from 0 to 10
//        for (int index = 0; index <= 10; index++) {
//            System.out.println(index);
//        }

        // Example 2: Counting down from ten to zero
        // This loop starts from 10 and decrements the index by 1 until it reaches 0
        for (int index = 10; index >= 0; index--) {
            System.out.println(index);
        }

        // After the loop, print a message
        System.out.println("HAPPY NEW YEAR!"); // This message will be printed once the loop finishes
    }
}
