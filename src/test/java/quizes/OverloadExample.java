package quizes;

public class OverloadExample {

    public void display(byte value) {
        System.out.println("byte value: " + value);
    }

    public void display(short value) {
        System.out.println("short value: " + value);
    }

    public void display(int value) {
        System.out.println("int value: " + value);
    }

    public void display(long value) {
        System.out.println("long value: " + value);
    }

    public void display(Integer value) {
        System.out.println("Integer value: " + value);
    }

    public static void main(String[] args) {
        OverloadExample overloadExample = new OverloadExample();
        overloadExample.display(10);

    }
}
