package string;

public class Alamin123Khan {

    public static void main(String[] args) {

        // Initialize a string with both alphabetic and numeric characters
        String inputString = "Alamin123Khan";

// StringBuilder for storing alphabetic characters
        StringBuilder alphabeticPart = new StringBuilder();

// StringBuilder for storing numeric characters
        StringBuilder numericPart = new StringBuilder();

// Iterate through each character in the input string
        for (char currentChar : inputString.toCharArray()) {

            // Check if the character is a letter
            if (Character.isLetter(currentChar)) {

                // Append alphabetic character to alphabeticPart StringBuilder
                alphabeticPart.append(currentChar);

            } else {

                // Append numeric character to numericPart StringBuilder
                numericPart.append(currentChar);
            }
        }

// Print the results
        System.out.println("Alphabetic characters: " + alphabeticPart);
        System.out.println("Numeric characters: " + numericPart);


    }
}
