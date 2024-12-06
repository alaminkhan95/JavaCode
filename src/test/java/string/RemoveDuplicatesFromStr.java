package string;

public class RemoveDuplicatesFromStr {

    public static void main(String[] args) {
        System.out.println(removeDup("hello")); // helo
        System.out.println(removeDup("apple")); // aple
        System.out.println(removeDup("aaaaaa")); // a
        System.out.println(removeDup("abc")); // abc
    }

    static  String removeDup(String string){

        StringBuilder strNoDup = new StringBuilder();

        for (char ch : string.toCharArray()){

            if (!strNoDup.toString().contains(String.valueOf(ch))){
                strNoDup.append(ch);
            }

        }

        return strNoDup.toString();
    }
}
