package quizes;

public class StringToNumberConverter {

    public static void main(String[] args) {

        String str ="123";
        int answer = 0, factor = 1;
        for (int i = str.length()-1; i >= 0; i--) {

            answer += (str.charAt(i) - '0') * factor;

            factor *= 10;
        }

        System.out.println(answer+2);

    }


}
