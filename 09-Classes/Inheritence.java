class food{
    void eat(){
        System.out.println("eating...");
    }
    void sleep(){
        System.out.println("sleeping...");
    }
}
class snack extends food{
    void eat(){
        System.out.println("eating snacks...");
    }
}
class meal extends food{
    void eat(){
        System.out.println("eating meal...");
    }
}
class drink extends food{
    void eat(){
        System.out.println("drinking...");
    }
}


class Inheritence{
    public static void main(String[] args) {
        snack s = new snack();
        s.eat();
        meal m = new meal();
        m.eat();
        drink d = new drink();
        d.eat();
        s.sleep();  
        
    }
}