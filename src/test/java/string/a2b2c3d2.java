package string;

public class a2b2c3d2 {

    public static void main(String[] args) {

        // Initialize a string with characters and their corresponding counts
        String inputString = "a2b2c3d2";

        // Iterate through each character in the string
        for (int i = 0; i < inputString.length(); i++) {

            // Check if the current character is an alphabetic letter
            if (Character.isAlphabetic(inputString.charAt(i))) {

                // Print the alphabetic character once
                System.out.print(inputString.charAt(i));

            } else {

                // Convert the numeric character to its integer value
                int repeatCount = Character.getNumericValue(inputString.charAt(i));

                // Print the previous character (letter) based on the repeat count
                for (int j = 1; j < repeatCount; j++) {
                    System.out.print(inputString.charAt(i - 1));
                }
            }
        }

        //aabbcccdd
        }

    }

