package master;

import java.util.HashMap;
import java.util.Set;

public class CharacterPrinter {

    public static void main(String[] args) {

        characterPrinter();
        uniqueCharacterPrinter();
        DuplicateCharacterPrinter();
    }

    public static void characterPrinter(){

        String string = "HelloWorld";

        char[] chars = string.toCharArray();

        HashMap<Character,Integer> hashMap = new HashMap<>();

        for (char c : chars){

            if (hashMap.containsKey(c)){

                hashMap.put(c,hashMap.get(c)+1);

            }else {

                hashMap.put(c,1);
            }
        }

        System.out.println(hashMap);



    }

    public static void uniqueCharacterPrinter(){

        String string = "HelloWorld";

        char[] chars = string.toCharArray();

        HashMap<Character,Integer> hashMap = new HashMap<>();

        for (char c : chars){

            if (hashMap.containsKey(c)){

                hashMap.put(c,hashMap.get(c)+1);

            }else {

                hashMap.put(c,1);
            }
        }

        System.out.println("Unique characters with count");

        Set<Character> set = hashMap.keySet();

        for (char c : set){

            if (hashMap.get(c)==1){
                System.out.println(c+"=======>"+hashMap.get(c));
            }

        }

    }

    public static void DuplicateCharacterPrinter(){

        String string = "HelloWorld";

        char[] chars = string.toCharArray();

        HashMap<Character,Integer> hashMap = new HashMap<>();

        for (char c : chars){

            if (hashMap.containsKey(c)){

                hashMap.put(c,hashMap.get(c)+1);

            }else {

                hashMap.put(c,1);
            }
        }
        System.out.println("Duplicate characters with count");
        Set<Character> set = hashMap.keySet();

        for (char c : set){

            if (hashMap.get(c)>1){
                System.out.println(c+"=======>"+hashMap.get(c));
            }

        }

    }


}
