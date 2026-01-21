import java.util.*;

class  SwitchCaseExample{
    public static void main(String args[]){
        System.out.println("Switch Case Example");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter \n1.Add \n2.Subtract \n3.Multiply \n4.Divide  \n5.exit\nChoose an operation: ");
        int ch = sc.nextInt();

        switch(ch){
            case 1:
                System.out.println("Addition : "+ num1 +"+"+  num2 +"=" + (num1 + num2));
                break;

            case 2:
                System.out.println("Subtraction : "+ num1 +"-"+  num2 +"=" + (num1 - num2));
                break;

            case 3:
                System.out.println("Multiplication : "+ num1 +"x"+  num2 +"=" + (num1 * num2));
                break;

            case 4:
                System.out.println("Division : "+ num1 +"/"+  num2 +"=" + (num1 / num2));
                break;

            case 5:
                System.out.println("Exiting...");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid Choice");    
                }

                sc.close();

    }
}
