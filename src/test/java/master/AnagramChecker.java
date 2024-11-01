package master;

import java.util.Arrays;

public class AnagramChecker {


    public static void main(String[] args) {
        anagramChecker();
    }


        public static void anagramChecker() {

            String string1 = "listen";
            String string2 = "silent";

            char[] stringArray1 = string1.toCharArray();
            char[] stringArray2 = string2.toCharArray();

            Arrays.sort(stringArray1);
            Arrays.sort(stringArray2);

            boolean isEquals = Arrays.equals(stringArray1, stringArray2);

            if (isEquals) {
                System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are anagrams.");
            } else {
                System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are not anagrams.");
            }
        }

    }


