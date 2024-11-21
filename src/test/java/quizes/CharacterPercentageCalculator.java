package quizes;

import java.text.DecimalFormat;

public class CharacterPercentageCalculator {

    public static void main(String[] args) {

        String name = "MyNameIaaaAlaminKhan#%@12345";
        int len = name.length();

        int upperCaseCount =0;
        int lowerCaseCount =0;
        int digitCount =0;
        int specialCharacterCount =0;

        for (int i =0;i<len;i++){

            char ch = name.charAt(i);

            if (Character.isUpperCase(ch)){

                upperCaseCount++;
            }else if (Character.isLowerCase(ch)){

                lowerCaseCount++;
            }else if (Character.isDigit(ch)){

                digitCount++;
            }else {

                specialCharacterCount++;
            }

        }


        double upperCaseParcentTage = (upperCaseCount*100.0)/len;
        double lowerCaseParcentTage = (lowerCaseCount*100.0)/len;
        double digitParcentTage = (digitCount*100.0)/len;
        double specialCharacterParcentage = (specialCharacterCount*100.0)/len;

        DecimalFormat decimalFormat = new DecimalFormat("##.##");

        System.out.println("UpperCase ParcenTage =======> "+decimalFormat.format(upperCaseParcentTage));
        System.out.println("LowerCase ParcenTage  =======> "+decimalFormat.format(lowerCaseParcentTage));
        System.out.println("digit ParcenTage =======> "+decimalFormat.format(digitParcentTage));
        System.out.println("special character ParcenTage =======> "+decimalFormat.format(specialCharacterParcentage));


    }

}
