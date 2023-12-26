

public class factorial {

    public static int Fact(int n){
        if(n == 0){
            return 1;
        }
        return n * Fact(n-1);
    }
    public static void main(String[] args){
        int number = 4;
        System.out.println("The Factorial Number of "+ number + " is : " + Fact(number) );
    }
}
