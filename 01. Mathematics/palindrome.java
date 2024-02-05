public class palindrome {
    public static boolean Palindromes(int n){
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
        if(Palindromes(number) == true){
            System.out.println("It's Palindrome");
        }
        else{
            System.out.println("It's not Palindrome");
        }
    }
}
