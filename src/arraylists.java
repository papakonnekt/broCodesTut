import java.util.ArrayList; // Import the ArrayList class from the java.util package

public class arraylists { // Define a public class named 'arraylists'

    public static void main(String[] args) { // Main method, the entry point of the program

        // ArrayLists are a type of resizable array that can have elements added and removed after the compilation phase.
        // They can only store reference data types (objects).

        // Create an ArrayList of Strings named 'food'
        ArrayList<String> food = new ArrayList<String>();

        // Add some food items to the ArrayList
        food.add("pizza");      // Add "pizza" to the ArrayList
        food.add("hamburger");  // Add "hamburger" to the ArrayList
        food.add("hot-dog");    // Add "hot-dog" to the ArrayList

        // The for loop will iterate through the ArrayList
        // 'i' is the index variable, starting at 0
        // 'i < food.size()' means the loop will run as long as 'i' is less than the size of the ArrayList
        // 'i++' increments 'i' by 1 in each iteration
        for (int i = 0; i < food.size(); i++) {

            // This will print each item in the ArrayList
            // 'food.get(i)' retrieves the element at index 'i' from the ArrayList
            System.out.println(food.get(i));

        }
    }
}
