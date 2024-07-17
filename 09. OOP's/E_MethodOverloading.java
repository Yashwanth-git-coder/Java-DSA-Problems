public class E_MethodOverloading {
    public static void main(String[] args){
        Calclu add = new Calclu();

        System.out.println(add.sum(2, 4));
        System.out.println(add.sum((float) 1.3, (float) 3.4));
        System.out.println(add.sum(2, 4, 6));
    }
}

class Calclu {
    int sum;

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        this.sum = a + b + c;
        return this.sum;
    }
}
