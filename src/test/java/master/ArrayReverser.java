package master;

public class ArrayReverser {


    public static void main(String[] args) {
        arrayReverser();
    }

    public static void arrayReverser(){

        int[] arr ={5,4,3,2,1};

        for (int i =arr.length-1;i>=0;i--){

            System.out.print(arr[i]+" ");
        }

    }
}
