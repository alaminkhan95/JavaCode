package master;

public class StringSwapper {

    public static void main(String[] args) {
        swapStrings();
    }

    public static void swapStrings() {
        String firstName = "Alamin";
        String lastName = "Khan";

        // Display the names before swapping
        System.out.println("Before swapping: " + firstName + " && " + lastName);

        // Swapping logic
        firstName = firstName + lastName;  // Concatenate the two strings
        lastName = firstName.substring(0, firstName.length() - lastName.length()); // Get the original firstName
        firstName = firstName.substring(lastName.length()); // Get the original lastName

        // Display the names after swapping
        System.out.println("After swapping: " + firstName + " && " + lastName);
    }
}
