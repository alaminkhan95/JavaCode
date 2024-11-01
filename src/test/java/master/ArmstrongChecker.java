package master;

public class ArmstrongChecker {

    public static void main(String[] args) {
        checkArmstrongNumber(372);
        checkArmstrongNumber(371);
    }

    public static void checkArmstrongNumber(int numberToCheck) {

        int originalNumber = numberToCheck;
        double armstrongSum = 0;

        // Calculate the sum of the cubes of the digits
        while (numberToCheck != 0) {
            int digit = numberToCheck % 10;
            armstrongSum += Math.pow(digit, 3);
            numberToCheck /= 10;
        }

        // Check if the original number is equal to the armstrong sum
        if (originalNumber == armstrongSum) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
