package master;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class Testclass {

    public static void main(String[] args) throws IOException {


        String string = "i love programming";

        StringBuilder stringBuilder = new StringBuilder();

        String[] words = string.split(" ");

        for (String word : words){

            stringBuilder.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }

        System.out.println(stringBuilder);

        }


}























