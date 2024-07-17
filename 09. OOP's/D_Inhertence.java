public class D_Inhertence {
    public static void main(String[] args){
        Fish shark = new Fish();

        shark.eat();
    }
}

//base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }
    
    void breath() {
        System.out.println("breaths");
    }
}

//Derived class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("It swims");
    }
}