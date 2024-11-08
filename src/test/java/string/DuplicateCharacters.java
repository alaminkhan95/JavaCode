package string;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacters {

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

        Set<Character> characterSet = hashMap.keySet();

        for (char c :characterSet){

            if (hashMap.get(c)>1){

                System.out.println(c+"========>"+hashMap.get(c));
            }
        }


//        H========>2
//        l========>4
    }
}
