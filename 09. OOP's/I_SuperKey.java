public class I_SuperKey {
    public static void main(String[] args){
        Horse h1 = new Horse();
        System.out.println(h1.color);
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("It can eat Anything !!");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "brown";
        System.out.println("Horse Constructor Called !!");
    }
}

