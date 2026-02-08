public class recurstionPermutation{

    public static void  printPerm(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for (int i=0; i<str.length(); i++){
            /*a-0 b-1 c-2*/
            char currentChar = str.charAt(i);
            String NewString = str.substring(0,i) + str.substring(i+1);
            printPerm(NewString, permutation+currentChar);
        }
    }

    public static void main(String[] args) {
    String str = "abc";
    printPerm(str,"");


    }
}