package string;

import java.util.HashMap;

public class ReverseCharacterIndexer {

    public static void main(String[] args) {

        String input = "prince";
        HashMap<Character, Integer> charMap = new HashMap<>();

        int index = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            char currentChar = input.charAt(i);
            if (!charMap.containsKey(currentChar)) {
                charMap.put(currentChar, index++);
            }
        }

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i) + " -> " + charMap.get(input.charAt(i)));
        }

    }

}
