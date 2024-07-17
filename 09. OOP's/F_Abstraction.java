public class F_Abstraction {
    public static void main(String[] args){
        Horse h = new Horse();
        h.walk();
        h.eats();

        Hen he = new Hen();
        he.walk();
        he.eats();
    }
}

abstract class Animal {
    void eats(){
        System.out.println("Eats Anything");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("It has a 4 legs!!");
    }
}

class Hen extends Animal {
    void walk() {
        System.out.println("It ha a2 legs!!");
    }
}


