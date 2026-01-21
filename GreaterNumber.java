import java.util.*;

class  GreaterNumber{
    public static void main(String args[]){
        System.out.println("Check which number is greater among two numbers");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        }
        else if(num2 > num1){
            System.out.println(num2 + " is greater than " + num1);
        }
        else{
            System.out.println("Both numbers are equal");
        }
        sc.close();
    }
}
