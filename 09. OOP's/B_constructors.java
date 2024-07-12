import java.sql.Struct;

public class B_constructors {
    public static void main(String[] args){
        Student s1 = new Student("Yashwanth");
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int roll;

    Student(String name){
        this.name = name;
    }
}
