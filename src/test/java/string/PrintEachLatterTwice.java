package string;

public class PrintEachLatterTwice {

    public static void main(String[] args) {

        String string = "Hello";

        StringBuilder stringBuilder = new StringBuilder();

        for (char c : string.toCharArray()){

            stringBuilder.append(c).append(c);
        }

        System.out.println(stringBuilder);
    }
}
