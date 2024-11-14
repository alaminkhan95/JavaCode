package array;

import java.util.HashMap;

public class UniqueNumberFromArray {

    public static void main(String[] args) {

        int[] array = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};

        HashMap<Integer,Integer> hashMap = new HashMap<>();


        for (int number : array){

            hashMap.put(number,hashMap.getOrDefault(number,0)+1);

        }

        for (int num : hashMap.keySet()){

            if (hashMap.get(num)==1){

                System.out.print(num+" ");
            }
        }

    }

    //3 4

}
