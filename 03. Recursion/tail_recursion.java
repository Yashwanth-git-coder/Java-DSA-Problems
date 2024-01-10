public class tail_recursion {
    static void fun(int n){
        if (n == 0)
            return;
        else
            System.out.print(n + " ");

        fun(n - 1);
    }
    public static void main(String[] args){
        int num = 5;
        fun(num);
    }
}
