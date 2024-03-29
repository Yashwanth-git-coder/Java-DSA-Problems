
public class check_prime {

    public static boolean CheckPrime(int n){
        if(n <= 1){
            return false;
        }
        if(n == 2 || n == 3){
            return true;
        }
        if(n%2 == 0 || n%3 == 0){
            return false;
        }
        for(int i=5 ; i <= Math.sqrt(n) ; i = i+6){
            if(n % i == 0 || n % (i +2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int number = 32;
        if( CheckPrime(number) == true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
