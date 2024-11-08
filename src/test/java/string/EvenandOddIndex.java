package string;

public class EvenandOddIndex {

    public static void main(String[] args) {

        // Initialize a string to print characters at even indices
        String inputString = "Automation";

// Iterate through each character in the string by index
        for (int index = 0; index < inputString.length(); index++) {

            // Check if the index is even
            if (index % 2 == 0) {

                // Print the character at the even index, followed by a space
                System.out.print(inputString.charAt(index) + " ");
            }
        }


    }
}
