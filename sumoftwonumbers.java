import java.util.*;

class sumoftwonumbers {
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum of " + number1 + " + " + number2 + " = " + sum);
        sc.close();

    }
}