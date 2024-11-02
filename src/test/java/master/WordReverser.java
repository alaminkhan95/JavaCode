package master;

public class WordReverser {

    public static void main(String[] args) {
        reverseWordsInSentence();
    }

    /**
     * This method reverses each word in a given sentence and prints the result.
     * For example, "Life is beautiful" becomes "efiL si lufituaeb".
     */
    public static void reverseWordsInSentence() {

        // Original sentence to be reversed word by word
        String sentence = "Life is beautiful";

        // Split the sentence into individual words based on spaces
        String[] words = sentence.split(" ");

        // This will store the final result of reversed words
        String reversedSentence = "";

        // Loop through each word in the array
        for (String word : words) {

            // To store the reversed version of each word
            String reversedWord = "";

            // Reverse the current word by iterating from end to start
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord =reversedWord+ word.charAt(i);  // Append each character in reverse order
            }

            // Append the reversed word and a space to the final result
            reversedSentence += reversedWord + " ";
        }

        // Print the sentence with each word reversed
        System.out.println(reversedSentence.trim());  // Using trim() to remove the trailing space
    }



}
