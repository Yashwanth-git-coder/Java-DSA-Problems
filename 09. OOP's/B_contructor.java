public class B_contructor {
    public static void main(String agrs[]){
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
