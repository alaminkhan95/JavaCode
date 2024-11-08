package string;

public class Alamin123Khan {

    public static void main(String[] args) {

        String string = "Alamin123Khan";

        StringBuilder alphaPart = new StringBuilder();
        StringBuilder numericPart = new StringBuilder();

       for (char c :string.toCharArray()){

           if (Character.isLetter(c)){

               numericPart.append(c);
           }else {

               alphaPart.append(c);
           }
       }


        System.out.println(alphaPart);
        System.out.println(numericPart);

    }
}
