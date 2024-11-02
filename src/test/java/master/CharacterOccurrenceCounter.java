package master;

public class CharacterOccurrenceCounter {

    public static void main(String[] args) {
        countCharacterOccurrences();
    }

    /**
     * This method counts the occurrences of a specific character in a given string.
     * For example, in "Lifeisbeautiful", the character 'i' appears 3 times.
     */
    public static void countCharacterOccurrences() {

        // The string in which to count occurrences of a character
        String text = "Lifeisbeautiful";

        // Character to be counted
        char characterToCount = 'i';

        // Calculate the length of the string after removing all occurrences of the specified character
        int lengthWithoutCharacter = text.replaceAll("i", "").length();

        // Calculate the difference in length to find the count of the character
        int characterCount = text.length() - lengthWithoutCharacter;

        // Print the number of times the character occurs in the string
        System.out.println("The character '" + characterToCount + "' appears " + characterCount + " times in the text.");
    }


}
