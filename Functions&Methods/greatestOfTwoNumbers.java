import java.util.*;
class greatestOfTwoNumbers{

    public static double greatestCalculator(double a, double b){
        if(a>b){
            return a;
        } else if(b>a){
            return b;
        } else {
            System.out.println("Both numbers are equal.");
            return a;
        }
    }

    public static void main(String args[]){
        System.out.println("Enter two numbers to find the greatest among them:");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        double num1=sc.nextDouble();
        System.out.print("Enter second number:");
        double num2=sc.nextDouble();
        double greatest = greatestCalculator(num1, num2);
        System.out.println("The greatest number is: " + greatest);
        sc.close();
    }
}