

public class palindrome {

    public static boolean Palindrome(int n){
        int reverse = 0;
        int temp = n;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp/10;
        }
        return (reverse == n);
    }
    public static void main(String[] args){
        int number = 2002;
        if(Palindrome(number) == true){
            System.out.println("It's Palindrome");
        }
        else{
            System.out.println("It's not Palindrome");
        }
    }
}
