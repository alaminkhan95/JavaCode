package string;

public class SwapTwoString {

    /*

    Java program to swap two string without using 3rd variable
     */
    public static void main(String[] args) {

        // Initialize two strings to swap their values without using a temporary variable
        String firstString = "Alamin";
        String secondString = "Khan";

// Print original values before swapping
        System.out.println("Before Swap: " + firstString + " && " + secondString);

// Concatenate firstString and secondString, storing the result in firstString
        firstString = firstString + secondString;

// Update secondString to be the original value of firstString
        secondString = firstString.substring(0, firstString.length() - secondString.length());

// Update firstString to be the original value of secondString
        firstString = firstString.substring(secondString.length());

// Print values after swapping
        System.out.println("After Swap: " + firstString + " && " + secondString);



    }
}
