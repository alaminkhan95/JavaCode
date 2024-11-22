package quizes;

public class HelloWorldPrinterWithoutMainAndStatic {

   public static int printString(){

       System.out.println("Hellow world");

       return 1;
   }

   static  int a = printString();

    public static void main(String[] args) {

    }
}
