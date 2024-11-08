package string;

public class VowelsConsonants {

    public static void main(String[] args) {

        // Initialize a string with mixed-case letters
        String inputString = "Hello World";

// Convert the string to lowercase to simplify vowel and consonant checks
        inputString = inputString.toLowerCase();

// Iterate through each character in the lowercase string
        for (char currentChar : inputString.toCharArray()) {

            // Check if the character is a vowel
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {

                // Print the character as a vowel
                System.out.println(currentChar + " is a vowel");

            } else {

                if (Character.isAlphabetic(currentChar)){
                    System.out.println(currentChar + " is a consonant");
                }

                // Print the character as a consonant

            }
        }



    }
}
