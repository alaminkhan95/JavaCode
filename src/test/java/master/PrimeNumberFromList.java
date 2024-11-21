package master;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFromList {

    public static void main(String[] args) {

        for (int number=1;number<=100;number++ ){
            int count = 0;

            if (number>1){

                for (int i =1;i<=number;i++){

                    if (number%i==0){

                        count++;

                    }
                }

                if (count==2){

                    System.out.println(number+" prime Number");

                }else {

                    System.out.println(number+" Non prime Number");
                }


            }else {

                System.out.println("NON PRIME ");
            }


        }

    }

    public void checkPrimeFromList(){


        List<Integer> numbers = new ArrayList<>();
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(7);

        for (int number : numbers){
            int count = 0;

            if (number>1){

                for (int i =1;i<=number;i++){

                    if (number%i==0){

                        count++;

                    }
                }

                if (count==2){

                    System.out.println(number+" prime Number");

                }else {

                    System.out.println(number+" Non prime Number");
                }


            }else {

                System.out.println("NON PRIME ");
            }


        }}
}
