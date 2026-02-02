public class recurstionTowerOfHanoi {

    public static void TowerOfHanoi( int n, String Source, String helper, String destination ){
        
        if(n == 1){
            System.out.println(" Move disk " + n+ " from "+ Source+" to "+ destination );
            return;
        }
        
        TowerOfHanoi(n-1,Source,destination,helper);
        System.out.println(" Move disk " + n + " from "+ Source +" to "+ destination );
        TowerOfHanoi(n-1,helper, Source, destination);
    }

    public static void main(String[] args) {
    int n = 3;
    TowerOfHanoi(n, "Source", "helper", "destination");
    }
}