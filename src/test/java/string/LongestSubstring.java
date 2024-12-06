package string;

import java.util.HashSet;

public class LongestSubstring {

    public static void main(String[] args) {

        String s = "geeksforgeeks";
        HashSet<Character> charSet = new HashSet<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {

            // If character is already in the set, shrink the window from the start

            while (charSet.contains(s.charAt(end))) {
                charSet.remove(s.charAt(start));
                start++;
            }

            // Add the current character to the set
            charSet.add(s.charAt(end));

            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }


        System.out.println("The length of the longest substring without repeating characters is: " + maxLength);

    }
}
