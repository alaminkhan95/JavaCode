package string;

public class ZeroShipter {

    public static void main(String[] args) {

        String Str = "32400121200";

        StringBuilder digit = new StringBuilder();
        StringBuilder zero = new StringBuilder();

        for (char c : Str.toCharArray()){

                if (c!='0'){

                    digit.append(c);
                }else {

                    zero.append(c);
                }

        }

        String string = zero.toString()+digit.toString();
        System.out.println(string);






    }
}
