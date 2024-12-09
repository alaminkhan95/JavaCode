package string;

public class SumOfDigitsInString {

    public static void main(String[] args) {

        String input = "prince123";
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                sum += Character.getNumericValue(currentChar);
            }
        }

        System.out.println("Sum of integers: " + sum);
    }
}
