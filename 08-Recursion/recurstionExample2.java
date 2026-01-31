public class recurstionExample2 {

    public static void RecurstionExample(int num){
        if(num == 6){
            return;
        }
        System.out.println(num);
        RecurstionExample(num+1);
    }

    public static void main(String[] args) {
        RecurstionExample(1);
    }
}
