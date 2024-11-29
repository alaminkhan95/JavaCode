package array;

import java.util.ArrayList;
import java.util.List;

public class NegetivePositiveArray {

    public static void main(String[] args) {


        int[] inputArray = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        List<Integer> negatives = new ArrayList<>();
        List<Integer> positives = new ArrayList<>();

        for (int num : inputArray){

            if (num<0){

                negatives.add(num);
            }else {

                positives.add(num);
            }
        }


        List<Integer> combinedList = new ArrayList<>(negatives);
        combinedList.addAll(positives);



        System.out.println(combinedList);
    }
}

// [-12, -13, -5, -7, -3, -6, 11, 6, 5]