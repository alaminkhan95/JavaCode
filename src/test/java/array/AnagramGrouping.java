package array;

import java.util.*;

public class AnagramGrouping {

    public static void main(String[] args) {


        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            // Sort the characters in the string to form the key
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // Add the original string to the corresponding anagram group
            anagramMap.putIfAbsent(sortedStr, new ArrayList<>());
            anagramMap.get(sortedStr).add(str);


        }

        System.out.println(anagramMap);
    }
}
