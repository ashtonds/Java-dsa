public class recurstionPower {

    public static int PrintPower(int x, int n){
        
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }

        int xpowernm = PrintPower(x, n-1);
        int power = x * xpowernm;
        return power;
        
    }

    public static void main(String[] args) {
        int n=5, x=2;
        int ans = PrintPower(x,n);
        System.out.println(ans);
    }
}