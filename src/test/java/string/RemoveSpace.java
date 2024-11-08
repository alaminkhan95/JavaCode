package string;

public class RemoveSpace {

    public static void main(String[] args) {


        // Initialize a string with spaces
        String inputString = "I live in texas";

// Remove all whitespace characters from the string
        inputString = inputString.replaceAll("\\s", "");

// Print the modified string without spaces
        System.out.println(inputString);

        //Iliveintexas



    }

}
