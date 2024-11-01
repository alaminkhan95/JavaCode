package master;

import java.util.ArrayList;

public class ZeroShifter {

    public static void main(String[] args) {

        int[] array ={1,2,0,0,0,3,4,5};

        int zeroCount =0;

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i =0;i<array.length;i++){

            if (array[i]!=0){

                arrayList.add(array[i]);
            }else {

                zeroCount++;
            }
        }

        for (int i =0;i<zeroCount;i++){

            arrayList.add(0);

        }

        System.out.println(arrayList);

    }

    //Shipt zero to the left

    public void  leftZeroShipter()
    {

        int[] array ={1,2,0,0,0,3,4,5};

        int zeroCount =0;

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i =0;i<array.length;i++){

            if (array[i]!=0){

                arrayList.add(array[i]);
            }else {

                zeroCount++;
            }
        }

        for (int i =0;i<zeroCount;i++){

            arrayList.add(0,0);

        }

        System.out.println(arrayList);

    }

    public void  middleZeroShipter()
    {

        int[] array ={1,2,0,0,0,3,4};

        int zeroCount =0;

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i =0;i<array.length;i++){

            if (array[i]!=0){

                arrayList.add(array[i]);
            }else {

                zeroCount++;
            }
        }

        int middlePosition = arrayList.size()/2;

        for (int i =0;i<zeroCount;i++){

            arrayList.add(middlePosition,0);

        }

        System.out.println(arrayList);

    }

    }


