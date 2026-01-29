public class setBits{
    public static void main(String[] args) {
       int n =1;
       int pos = 1;
       int bitMask = 1<<pos;

       int NewNumber = ( bitMask | n);
       System.out.println(NewNumber);
    }
}