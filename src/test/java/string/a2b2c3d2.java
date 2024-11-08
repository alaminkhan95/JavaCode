package string;

public class a2b2c3d2 {

    public static void main(String[] args) {

        String string ="a2b2c3d2";

        for (int i=0;i<string.length();i++){

            if (Character.isAlphabetic(string.charAt(i))){

                System.out.print(string.charAt(i));
            }else {

                int a = Character.getNumericValue(string.charAt(i));

                for (int j =1;j<a;j++){

                    System.out.print(string.charAt(i-1));
                }


            }
            //aabbcccdd
        }

    }
}
