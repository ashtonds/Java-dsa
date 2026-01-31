public class recurstionExample {

    public static void RecurstionExample(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        RecurstionExample(num-1);
    }

    public static void main(String[] args) {
        RecurstionExample(5);
    }
}
