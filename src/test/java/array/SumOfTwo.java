package array;

public class SumOfTwo {

    public static void main(String[] args) {

        int[] numArr = {13, 43, 2, 71};

        int num = 84;

        int[] numbers = new int[2];

        for (int i =0;i<numArr.length;i++){

            for (int j =i+1;j<numArr.length;j++){

                if (numArr[i]+numArr[j]==num){

                    numbers[0]=numArr[i];
                    numbers[1]= numArr[j];
//Add commit
                }
            }
        }

        for (int number : numbers){

            System.out.println(number);
        }

//{[(
    }
}
