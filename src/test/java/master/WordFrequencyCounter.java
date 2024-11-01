package master;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class WordFrequencyCounter {


    public static void main(String[] args) {

        String string = "Hello World Hello Anik";


        // Split

        String[] strings = string.split(" ");

        HashMap<String,Integer> hashMap = new HashMap<>();

        for(String word : strings){

            if (hashMap.containsKey(word)){

                hashMap.put(word,hashMap.get(word)+1);
            }else {

                hashMap.put(word,1);
            }
        }

        System.out.println(hashMap);

        // To print duplicate >1 && ==1 for unique

        Set<String> set = hashMap.keySet();

        for (String word :set){

            if (hashMap.get(word)>1){

                System.out.println(word+"=========>"+hashMap.get(word));
            }
        }

    }



}
