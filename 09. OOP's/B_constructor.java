public class B_constructor {
    public static void main(String agrs[]){
        Student s1 = new Student("Yashwanth");
        Student s2 = new Student();
        Student s3 = new Student("Yashwanth");
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
    }
}

class Student {
    String name;
    int roll;

    Student(){
        System.out.println("Constructor called !!");
    }

    Student(String name){
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}
