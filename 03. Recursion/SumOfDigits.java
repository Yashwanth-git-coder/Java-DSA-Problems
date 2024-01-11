public class SumOfDigits {

    public static int Sum_of_digits(int n){
        if(n == 0){
            return 0;
        }
        return (n % 10 + Sum_of_digits(n / 10));
    }
    public static void main(String[] args){
        int num = 12345;
        int result = Sum_of_digits(num);
        System.out.println("Sum of digits in " + num + " is " + result);
    }
}
