package string;

public class NumberOfWords {

    public static void main(String[] args) {

        String string = "Life is beautiful Alhamdulillah. My name is khan";

        int count =1;

        for (int i =0;i<string.length();i++){

            if ((string.charAt(i)==' ')&&(string.charAt(i+1)!=' ')){

                count++;
            }
        }

        System.out.println("Number of words in this sentence "+count);

    }

    // Number of words in this sentence 8

}
