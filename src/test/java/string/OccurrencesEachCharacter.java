package string;

import java.util.HashMap;

public class OccurrencesEachCharacter {

    public static void main(String[] args) {

        String givenString = "HHelloAll";

        HashMap<Character,Integer> hashMap = new HashMap<>();

        char[] chars = givenString.toCharArray();

        for (char c : chars){

            if (hashMap.containsKey(c)){

                hashMap.put(c,hashMap.get(c)+1);

            }else {

                hashMap.put(c,1);
            }
        }

        System.out.println(hashMap);

    }
}
