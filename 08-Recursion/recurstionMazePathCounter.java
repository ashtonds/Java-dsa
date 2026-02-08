public class recurstionMazePathCounter{

    public static int  MazePathCount(int i, int j, int a, int b){
        if(i==a || j==b){
            return 0;
        }
        if(i==a-1 && j==b-1){
            return 1;
        }

        int inputDownword = MazePathCount( i+1, j, a, b);
        int inputRight = MazePathCount( i, j+1, a, b);
        return inputDownword+inputRight;
    }

    public static void main(String[] args) {
    int a = 3;
    int b = 3;
    int PathCount = MazePathCount(0,0,a,b);
    System.out.println(PathCount);    
    }
}