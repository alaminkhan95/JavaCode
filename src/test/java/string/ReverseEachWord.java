package string;

public class ReverseEachWord {

    public static void main(String[] args) {

        String string = "Life is beautiful";

        String[] words = string.split(" ");

        String revSentance ="";

        for (String word : words){

            String revword ="";

            for (int i =word.length()-1;i>=0;i--){

                revword=revword+word.charAt(i);

            }

            revSentance =revSentance+revword+" ";


        }

        System.out.println(revSentance);

        //efiL si lufituaeb

    }
}
