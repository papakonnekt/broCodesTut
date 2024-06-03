public class twodArraystut { // Define a public class named 'twodArraystut'

    public static void main(String[] args) { // Main method, the entry point of the program
        // 2D arrays are arrays of arrays, similar to a grid of rows and columns, like a tic-tac-toe board.

//        // Complicated way to create and initialize a 2D array
        String[][] cars = new String[3][3]; // Declare a 2D array with 3 rows and 3 columns
//        cars[0][0] = "camaro";    // First row, first column
//        cars[0][1] = "ford";      // First row, second column
//        cars[0][2] = "silverado"; // First row, third column
//        cars[1][0] = "mustang";   // Second row, first column
//        cars[1][1] = "ranger";    // Second row, second column
//        cars[1][2] = "f150";      // Second row, third column
//        cars[2][0] = "ferrari";   // Third row, first column
//        cars[2][1] = "tesla";     // Third row, second column
//        cars[2][2] = "lambo";     // Third row, third column

        // Easy way to create and initialize a 2D array
        cars = new String[][] {  // Re-initialize the 'cars' 2D array with values
                {"camaro", "ford", "silverado"},  // First row
                {"mustang", "ranger", "f150"},    // Second row
                {"ferrari", "tesla", "lambo"}     // Third row
        };

        // Nested loops to iterate through the 2D array and print each element
        for (int i = 0; i < cars.length; i++) { // Outer loop for rows
            System.out.println(); // Print a new line for each row
            for (int j = 0; j < cars[i].length; j++) { // Inner loop for columns
                System.out.print(cars[i][j] + " "); // Print each element in the row followed by a space
            }
        }
    }
}
