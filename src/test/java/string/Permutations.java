package string;

public class Permutations {

    public static void main(String[] args) {

        permute("ABCD","");
    }

    static void permute(String str , String result){

        if (str.isEmpty()){

            System.out.println(result);
        }else {

            for (int i =0;i<str.length();i++){

               String rem = str.substring(0,i)+str.substring(i+1);

               permute(rem,result+str.charAt(i));
            }
        }

    }
}
