import java.util.ArrayList; // Import the ArrayList class from the java.util package

public class forEach { // Define a public class named 'forEach'

    public static void main(String[] args) { // Main method, the entry point of the program

        // The forEach loop provides an easy way to iterate through the elements in an array/collection.
        // It is easier to read and involves fewer steps compared to traditional loops, but it is less flexible.

        // Declare and initialize an ArrayList of Strings named 'animals'
        ArrayList<String> animals = new ArrayList<String>();

        // Add some animals to the ArrayList
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        // Iterate over each element in the 'animals' ArrayList using the forEach loop
        // This loop will execute once for each element in the ArrayList
        // 'i' is just a placeholder name for the current element being iterated over.
        // We use 'i' as a convention in this case to represent each element in the ArrayList.
        // Think of 'i' as a temporary name we give to each item in the ArrayList as we go through them one by one.
        for (String i : animals) {
            // Print each animal in the ArrayList
            // 'i' represents the current animal being printed
            System.out.println(i);
        }
    }
}
