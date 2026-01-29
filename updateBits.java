import java.util.*;

public class updateBits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt(); 
    
       int n =5; //0101
       int pos = 2;
       int bitMask = 1<<pos;
       
       if (oper == 0) {
        int NotBitMask = ~(bitMask);
        int NewNumber = NotBitMask & n;
        System.out.println(NewNumber);
       }
       else{
        int NewNumber = bitMask | n;
        System.out.println( NewNumber);
       }


       sc.close();
    }
}