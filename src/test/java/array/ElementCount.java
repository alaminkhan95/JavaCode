package array;

import java.util.HashMap;
import java.util.Map;

public class ElementCount {
    public static void main(String[] args) {

        int[] array = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};


        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int number : array){

            hashMap.put(number,hashMap.getOrDefault(number,0)+1);
        }


        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()){

            System.out.println(entry.getKey()+" : "+ entry.getValue());

        }

    }
}
