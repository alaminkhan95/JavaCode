package master;

public class PatternExpander {

    public static void main(String[] args) {
        patternExpander();


    }

    public static void patternExpander() {

        String string = "a2b3c4";

        for (int i = 0; i < string.length(); i++) {

            if (Character.isAlphabetic(string.charAt(i))) {

                // Print the character at the current position
                System.out.print(string.charAt(i));

            } else {

                int repeatCount = Character.getNumericValue(string.charAt(i));

                // Print the previous character repeatCount - 1 times (since it's already printed once)
                for (int j = 1; j < repeatCount; j++) {
                    System.out.print(string.charAt(i - 1));
                }
            }
        }
    }
}
