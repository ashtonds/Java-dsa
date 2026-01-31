public class recurstionSumofNaturalNum {

    public static void Printsum(int i, int sum, int n){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum =+ i;
        Printsum(i+1,sum,n);
    }

    public static void main(String[] args) {
        Printsum(0,0,9);
    }
}
