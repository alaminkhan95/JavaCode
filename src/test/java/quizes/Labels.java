package quizes;

public class Labels {

    public static void main(String[] args) {
        System.out.println("Hello");

        alamin: // this is a comment

        System.out.println("World");

        task:
        for (int i =0;i<=10;i++){

            System.out.println(i);

            if (i==5){

                break task;
            }
        }
    }
}
