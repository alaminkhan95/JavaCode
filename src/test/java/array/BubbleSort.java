package array;

public class BubbleSort {

    /**
     *
     * Sort an array without using in-built
     * method
     * @param args
     */

    public static void main(String[] args) {

        int[] array = {3, 7, 1, 4, 9, 2, 5};

        for (int i =0;i<array.length;i++){

            for (int j =i+1;j<array.length;j++){

                if (array[i]>array[j]){

                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }

        }

        for (int number : array){

            System.out.print(number+" ");
        }
    }
}
