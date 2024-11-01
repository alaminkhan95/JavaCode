package master;

public class Testclass {

    public static void main(String[] args) {

        int[] array = {100,200,300,400};
        int temp;

        for (int i =0;i<array.length;i++){

            for (int j =i+1;j<array.length;j++){

                if (array[i]<array[j]){

                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }

            }
        }

        int count =1;
        for (int i =1;i<array.length;i++){

            if (array[i]!=array[0]){

               count++;
            }

            if (count==4){
                System.out.println(array[i]);
                break;
            }
        }

    }
}
