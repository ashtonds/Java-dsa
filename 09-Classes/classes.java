class car{
    String name;
    String color;
    int price;

    public car(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
    public void display(){
        System.out.println("Name:"+name +" "+"Color:"+ color +" "+"Price:"+ price);
    }

}

public class classes{
    public static void main(String[] args) {
        car c1 = new car("BMW","Black",5000);
        car c2 = new car("Audi","White",4000);

        c1.display();
        c2.display();

    }
}