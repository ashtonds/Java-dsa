import java.util.*; 
//~~~~~OUTPUT~~~~~
/*

Enter the Number of of subjects
5
Enter subject names
Maths
Science
English
Computer Science
Hindi
Subject list
1 : Maths
2 : Science
3 : English
4 : Computer Science
5 : Hindi 

*/
class ArraySubject{
    public static void main(String[] args) {
        System.out.println("Enter the Number of of subjects");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] subjects = new String[size];
        System.out.println("Enter subject names");
        sc.nextLine();
        for(int i=0; i<size; i++){
            subjects[i]= sc.nextLine();
        }
        System.out.println("Subject list");
        for(int i=0; i<size; i++){
            System.out.println( (i+1) +" : "+subjects[i]);
        }
        sc.close();
    }
}