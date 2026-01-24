import java.util.*;
class powerOfNumber{

    public static void powerCalculator(int n, int x){
        int power = 1;
        for(int i=1; i<=x; i++){
            power = power * n;
        }
        System.out.print(n + "to the power of "+x+" is : "+power);
    }

    public static void main(String args[]){
        System.out.println("Calclate the power of a number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("Enter the Power : ");
        int x = sc.nextInt();
        powerCalculator(n, x);
        sc.close();
    }
}