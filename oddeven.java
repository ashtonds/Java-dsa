import java.util.*;

class  oddeven{
    public static void main(String args[]){
        System.out.println("----Check if a number is odd or even----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(number % 2 ==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        sc.close();
    }
}