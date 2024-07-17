public class D_Inhertence {
    public static void main(String[] args){
        Dog doggy = new Dog();

        doggy.eat();
        doggy.legs = 5;
        System.out.println(doggy.legs);
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
class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}