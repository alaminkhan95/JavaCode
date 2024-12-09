package string;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Stack;

public class TestString {

    public static void main(String[] args) {



        String string = "[{()}]";

        boolean flag = true;

        Stack<Character> stack = new Stack<>();

        for (char c : string.toCharArray()){

            if (c== '{' || c == '(' || c == '['){

                stack.push(c);
            }else {

                if (stack.isEmpty()){

                    flag=false;
                }

                char lastCharacter = stack.pop();

                if(lastCharacter=='{'&& c != '}'){

                    flag =false;
                } else if (lastCharacter=='(' && c != ')') {
                    flag =false;
                } else if (lastCharacter=='[' && c != ']') {
                    flag=false;
                }

            }

        }

        if (flag && stack.isEmpty()){

            System.out.println("Balanced String");
        }else {

            System.out.println("Imbalanced string");
        }








    }





}
