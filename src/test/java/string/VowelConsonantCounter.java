package string;

import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        vowelConsonantCounter();

    }

    public static void vowelConsonantCounter() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter a String");

        String string = scanner.nextLine();

        string = string.toUpperCase();

        char[] chars = string.toCharArray();

        for (char c : chars) {

            if (c >= 'A' && c <= 'Z') { // Ensure we're only checking alphabetic characters
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    System.out.println(c + " is a vowel");
                } else {
                    System.out.println(c + " is a consonant");
                }
            }


        }
    }}
