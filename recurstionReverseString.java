public class recurstionReverseString {

    public static void ReverseString(String str,int idx ){
        
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        
        System.out.print(str.charAt(idx));
        ReverseString(str,idx-1);
    }

    public static void main(String[] args) {
    
    String str = "ashton";
    ReverseString(str,str.length()-1);
    }
}