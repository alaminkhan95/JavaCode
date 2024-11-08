package string;

public class PrintEachLatterTwice {

    /**
     *
     * Java program to print each letter twice
     * from a given string
     *
     */

    public static void main(String[] args) {

        // Initialize the input string
        String inputString = "Hello";

// Create a StringBuilder to build the result
        StringBuilder resultStringBuilder = new StringBuilder();

// Iterate through each character in the input string
        for (char currentChar : inputString.toCharArray()) {

            // Append the character twice to the StringBuilder
            resultStringBuilder.append(currentChar).append(currentChar);
        }

// Print the final result
        System.out.println(resultStringBuilder);

//HHeelllloo
    }
}
