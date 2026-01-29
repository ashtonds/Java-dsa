import java.util.*;

public class BubbleSort{
    public static void Printer(int arr[]){
        System.out.println("---- Sorted Array ----");
        for(int i=0; i<arr.length; i++){
            
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = {10,5,15,22,1};

        // bubblw sort
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
        }
        }
        Printer(arr);
        
       sc.close();
    }
}