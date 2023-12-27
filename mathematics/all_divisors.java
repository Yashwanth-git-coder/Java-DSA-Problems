import java.util.ArrayList;
import java.util.List;

public class all_divisors {
    
    public static void All_Divisors(int n){
        List<Integer> divisors = new ArrayList<>();

        for(int i = 1 ; i <= Math.sqrt(n) ; i++){
            if( n % i == 0){
                if(n / i == i){
                    System.out.println(i);
                }
                else{
                    System.out.println(i);
                    divisors.add(n/i);
                }
            }
        }
        for(int i = divisors.size()-1; i >= 0 ; i--){
            System.out.println(divisors.get(i));
        }
    }

    public static void main(String[] args){
        int number = 100;
        System.out.println("The Divisors of " + number + " is :" );
        All_Divisors(number);
    }
}