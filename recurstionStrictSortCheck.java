public class recurstionStrictSortCheck{

    public static boolean StrictSortCheck(int arr[], int index){
        if(index == arr.length-1){
             return true;
        }
        if(arr[index ]<arr[index+1]){
            return StrictSortCheck(arr,index+1);
        }
        else {
        return false;}
    }

    public static void main(String[] args) {
    
    int arr[] = {1,3,4,6,8};

    boolean Check = StrictSortCheck(arr,0);

    System.out.print(Check);



    }
}