package string;

public class aBACbcEDed {

    public static void main(String[] args) {

        String string = "AaBCbcEDed";

        StringBuilder uppercase = new StringBuilder();
        StringBuilder lowercase = new StringBuilder();

        for (char c :string.toCharArray()){

            if (Character.isLowerCase(c)){

                lowercase.append(c);
            }else {

                uppercase.append(c);
            }

        }

        System.out.println(uppercase);
        System.out.println(lowercase);

//        Output in lowercase: abced
//        Output in uppercase: ABCED


    }

}
