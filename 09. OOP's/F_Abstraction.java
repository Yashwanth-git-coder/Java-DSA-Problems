public class F_Abstraction {
    public static void main(String arg[]) {
        Horse h = new Horse();
        h.eats();
        h.walk();

        Hen he = new Hen();
        he.eats();
        he.walk();
    }
}

abstract class Animal {
    void eats() {
        System.out.println("Eats Anything");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("It has 4 legs!!");
    }
}

class Hen extends Animal {
    void walk() {
        System.out.println("It has 2 legs!!");
    }
}
