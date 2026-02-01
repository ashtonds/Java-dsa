public class recurstionFibonacci {

    public static void PrintFibonacci(int a, int b, int num){
        
         if(num == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        PrintFibonacci(b,c,num-1);
        
        
    }

    public static void main(String[] args) {
        int a =0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
       int n = 8;
       PrintFibonacci( a, b,  n );
    }
}