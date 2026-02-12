class studentdata{
    String name;
    int rollno;
    String course;

    studentdata(String name, int rollno, String course){
        this.name = name;
        this.rollno = rollno;
        this.course = course;
    }
    public void display(){
    System.out.println("Name:"+name +" "+"Roll No:"+ rollno +" "+"Course:"+ course);
}
}

public class student{
    public static void main(String[] args) {
        studentdata s1 = new studentdata("Ashutosh", 101, "B.Tech");
        studentdata s2 = new studentdata("Rahul", 102, "B.Sc");

        s1.display();
        s2.display();
    }
        
}