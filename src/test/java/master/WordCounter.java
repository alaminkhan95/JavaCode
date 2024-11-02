package master;

public class WordCounter {

    public static void main(String[] args) {
        countWordsInSentence();
    }

    /**
     * This method counts the number of words in a given sentence.
     * For example, "Life is beautiful is not it?" has 6 words.
     */
    public static void countWordsInSentence() {

        // Sentence to count words in
        String sentence = "Life is beautiful is not it?";

        // Initialize word count to 1 since there is at least one word
        int wordCount = 1;

        // Loop through each character in the sentence, starting from the second character
        for (int i = 1; i < sentence.length(); i++) {

            // Check if the current character is a space and the next character is not a space
            if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) != ' ') {
                wordCount++;  // Increment word count for each word found
            }
        }

        // Print the final word count
        System.out.println("Total words in the sentence: " + wordCount);
    }

}
