public class switchtut { // Define a public class named 'switchtut'
    public static void main(String[] args) { // Main method, the entry point of the program

        // Declare and initialize a String variable 'day' with the value "Friday"
        String day = "Friday";

        // Use a switch statement to execute different blocks of code based on the value of 'day'
        switch(day) {
            // Each 'case' represents a possible value of 'day'
            case "Sunday":
                // If 'day' is "Sunday", print "It is Sunday!" and break out of the switch statement
                System.out.println("It is Sunday!");
                break;
            case "Monday":
                // If 'day' is "Monday", print "It is Monday!" and break out of the switch statement
                System.out.println("It is Monday!");
                break;
            case "Tuesday":
                // If 'day' is "Tuesday", print "It is Tuesday!" and break out of the switch statement
                System.out.println("It is Tuesday!");
                break;
            case "Wednesday":
                // If 'day' is "Wednesday", print "It is Wednesday!" and break out of the switch statement
                System.out.println("It is Wednesday!");
                break;
            case "Thursday":
                // If 'day' is "Thursday", print "It is Thursday!" and break out of the switch statement
                System.out.println("It is Thursday!");
                break;
            case "Friday":
                // If 'day' is "Friday", print "It is Friday!" and break out of the switch statement
                System.out.println("It is Friday!");
                break;
            case "Saturday":
                // If 'day' is "Saturday", print "It is Saturday!" and break out of the switch statement
                System.out.println("It is Saturday!");
                break;
            default:
                // The 'default' case is executed if none of the above cases match the value of 'day'
                // This handles any unexpected values that do not correspond to any of the days of the week
                System.out.println("That is not a day");
                break; // Although not strictly necessary after the 'default' case, it's good practice to include it
        }
    }
}
