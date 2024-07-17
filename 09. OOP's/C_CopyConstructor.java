public class C_CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Yashwanth";
        s1.roll = 234;
        // s1.password = "asfe"; // Optional: Uncomment if needed

        System.out.println(s1.name);
        System.out.println(s1.roll);

        s1.marks[0] = 100;
        s1.marks[1] = 240;
        s1.marks[2] = 103;

        Student s2 = new Student(s1);
        // s2.password = "xyz"; // Optional: Uncomment if needed

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password; // Added password field
    int[] marks; // Array initialization moved to constructor

    // Copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        // this.password = s1.password; // Optional: Uncomment if needed
        this.marks = new int[s1.marks.length];
        for (int i = 0; i < s1.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
