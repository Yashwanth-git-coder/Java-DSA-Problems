

public class trailing_zeros {

    public static int trailing_zero(int n){
        if(n < 0){
            return -1;
        }
        int count = 0;
        for(int i = 5 ; n/i>=1 ; i*=5){
            count += n/i;
        }
        return count;
    }
    public static void main(String[] args){
        int number = 100;
        System.out.println("The Trailing Zeros in Factorial of " + number + " is : " + trailing_zero(number));
    }
}
