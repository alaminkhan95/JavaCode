package master;


import java.io.*;
import java.util.ArrayList;

public class Testcase {

    public static void main(String[] args) throws IOException {


        int[] numArr = {13, 43, 2, 71};

        int[] sumNumbers = new int[2];

        int num = 84;

        for (int i = 0; i < numArr.length; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] + numArr[j] == num) {

                    sumNumbers[0] = numArr[i];
                    sumNumbers[1] = numArr[j];
                }
            }
        }

        for (int number : sumNumbers){

            System.out.println(number);
        }


    }

















}


















