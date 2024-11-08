package string;

public class aBACbcEDed {

    public static void main(String[] args) {

        // Initialize a mixed-case string
        String inputString = "AaBCbcEDed";

// StringBuilder for storing uppercase letters
        StringBuilder uppercaseLetters = new StringBuilder();

// StringBuilder for storing lowercase letters
        StringBuilder lowercaseLetters = new StringBuilder();

// Iterate through each character in the input string
        for (char currentChar : inputString.toCharArray()) {

            // Check if the character is lowercase
            if (Character.isLowerCase(currentChar)) {

                // Append lowercase character to lowercase StringBuilder
                lowercaseLetters.append(currentChar);

            } else {

                // Append uppercase character to uppercase StringBuilder
                uppercaseLetters.append(currentChar);
            }
        }

// Print the results
        System.out.println("Uppercase letters: " + uppercaseLetters);
        System.out.println("Lowercase letters: " + lowercaseLetters);


//        Uppercase letters: ABCED
//        Lowercase letters: abcbed



    }

}
