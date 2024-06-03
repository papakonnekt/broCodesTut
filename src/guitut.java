import javax.swing.JOptionPane; // Import the JOptionPane class from the javax.swing package

public class guitut { // Define a public class named 'guitut'

    public static void main(String[] args) { // Main method, the entry point of the program

        // Prompt the user to enter their name using a dialog box
        String name = JOptionPane.showInputDialog("Enter your name");
        // ^ Displays a dialog box with a message "Enter your name" and waits for the user to input text.
        // The input text provided by the user is stored in the variable 'name' of type String.

        // Display a greeting message using a dialog box with the user's name
        JOptionPane.showMessageDialog(null, "Hello " + name);

        // Prompt the user to enter their age using a dialog box
        // Convert the input string to an integer using parseInt method
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        // Display a message about the user's age using a dialog box
        JOptionPane.showMessageDialog(null, "You are " + age + " years old!");

        // Prompt the user to enter their height using a dialog box
        // Convert the input string to a double using parseDouble method
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));

        // Display a message about the user's height using a dialog box
        JOptionPane.showMessageDialog(null, "You are " + height + " tall!");
    }
}
