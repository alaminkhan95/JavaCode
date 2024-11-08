package string;

public class Palindrome {

    public static void main(String[] args) {

        String string ="Student";

        String orginalString = string;

        String revString= "";

        for (int i =string.length()-1;i>=0;i--){

            revString=revString+string.charAt(i);
        }

        if (orginalString.equals(revString)){

            System.out.println("Palindrome strong");
        }else {

            System.out.println("Non Palindrome strong");
        }




    }

}
