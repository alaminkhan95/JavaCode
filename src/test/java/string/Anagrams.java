package string;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {

        // Initializing two strings to check if they are anagrams
        String firstString = "listen";
        String secondString = "silent";

// Convert strings to character arrays for sorting
        char[] firstStringChars = firstString.toCharArray();
        char[] secondStringChars = secondString.toCharArray();

// Sort the character arrays to allow comparison of sorted sequences
        Arrays.sort(firstStringChars);
        Arrays.sort(secondStringChars);

// Check if the sorted character arrays are equal, indicating the strings are anagrams
        boolean areAnagrams = Arrays.equals(firstStringChars, secondStringChars);

// Output the result
        System.out.println("The two strings are anagrams: " + areAnagrams);

    }
}
