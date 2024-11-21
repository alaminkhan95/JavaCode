package quizes;

public class IncrementDecrement {

    public static void main(String[] args) {
        int x =5;
        System.out.println(x++ + ++x);
    }

    static void increment_1(){


        int i =5;
        int x = ++i + ++i;

        System.out.println(x);
        System.out.println(i);

//x = 13
// i = 7
    }

    static void increment_2(){


        int i =5;
        int x = i++ + ++i;

        System.out.println(x);
        System.out.println(i);

//x = 12
// i = 7
    }
}
