package string;

public class ReverseString {

    public static void main(String[] args) {


        String string = "STUDENTS";

        String revString = "";

        for (int i=string.length()-1;i>=0;i--){

            revString=revString+string.charAt(i);
        }

        System.out.println(revString);

    }
}
