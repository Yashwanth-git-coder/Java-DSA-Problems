public class intro {


    static int function(int n){
        if(n<0)
            return n;
        System.out.println(n);
        return function(n - 1); 
    }

    public static void main(String[] args){
        int number = 5;
        function(number);
    }
}