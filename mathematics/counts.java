

public class counts {

    public static int CountDigits(long number){
        if (number/10 == 0){
            return 1;
        }
        return 1 + CountDigits(number/10);
    }

    public static void main(String[] args){
        long number = 53421;
        System.out.println("Number of Digits: " + CountDigits(number));
    }
}
