package string;

public class EvenandOddIndex {

    public static void main(String[] args) {

        String string = "Automation";



        for (int i =0;i<string.length();i++){

            if (i%2==0){

                System.out.print(string.charAt(i)+" ");
            }
        }

    }
}
