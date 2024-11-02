package master;

public class WhiteSpaceRemover {

    public static void main(String[] args) {

        removeWhiteSpace();
    }

    /**
     * This method removes all whitespace characters from a given sentence and prints the result.
     * For example, " Life is beautiful" becomes "Lifeisbeautiful".
     */
    public static void removeWhiteSpace() {

        // Original sentence containing whitespace
        String sentence = " Life is beautiful";

        // Print the original sentence
        System.out.println("Original sentence: " + sentence);

        // Remove all whitespace characters from the sentence
        sentence = sentence.replaceAll("\\s", "");

        // Print the sentence without whitespace
        System.out.println("Sentence without whitespace: " + sentence);
    }

}
