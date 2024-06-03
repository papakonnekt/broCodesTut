public class arraystut { // Define a public class named 'arraystut'

    public static void main(String[] args) { // Main method, the entry point of the program

//        // Arrays are used to store multiple values in a single variable.
//        // Here, we declare an array of strings named 'cars' and initialize it with three values.
//        String[] cars = {"camaro", "tesla", "ford"};
//
//        // Modify the value at index 0 of the 'cars' array to "mustang".
//        cars[0] = "mustang";
//
//        // Print the value at index 1 of the 'cars' array.
//        // Expected output: "tesla", since we haven't modified this value.
//        System.out.println(cars[1]); // Output: tesla
//    }
//}
        // Create an array of Strings with a fixed size of 3
        String[] cars = new String[3];

        // Assign values to each element of the array
        cars[0] = "camaro"; // Set the first element to "camaro"
        cars[1] = "tesla";  // Set the second element to "tesla"
        cars[2] = "ford";   // Set the third element to "ford"

        // For loop to iterate through the array
        // 'i' is the index variable, starting at 0
        // 'i < cars.length' means the loop will run as long as 'i' is less than the length of the array
        // 'i++' increments 'i' by 1 in each iteration
        for (int i = 0; i < cars.length; i++) {
            // Print each element of the array
            // 'cars[i]' accesses the element at index 'i' in the array
            System.out.println(cars[i]);
        }
    }
}