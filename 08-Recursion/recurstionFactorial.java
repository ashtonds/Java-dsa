public class recurstionFactorial {

    public static int PrintFactorial(int num){
        
         if(num == 1 || num == 0){
            return 1;
        }
        
        int current_num = PrintFactorial(num-1);
        int fact = current_num * num;
        return fact;
    }

    public static void main(String[] args) {
       int n = 8;
       int output = PrintFactorial(n);
       System.out.println(output);
    }
}