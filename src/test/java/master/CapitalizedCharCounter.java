package master;

public class CapitalizedCharCounter {

    public static void main(String[] args) {
        capitalizedCharCounter();
    }

    public static void capitalizedCharCounter() {

        String string = "AlaminKhanBD";
        int count = 0; // Counter for uppercase characters

        System.out.print("Capitalized characters: ");

        for (int i = 0; i < string.length(); i++) {
            // Check if the character is uppercase
            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                System.out.print(string.charAt(i) + " ");
                count++; // Increment the counter
            }
        }

        // Print the total count of uppercase characters
        System.out.println("\nTotal number of capitalized characters: " + count);
    }

}
