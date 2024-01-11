

public class RopeCutting {

    static int maxcutts(int n , int a , int b , int c){
        if(n == 0){
            return 0;
        }
        if(n <= -1){
            return -1;
        }
        int res = Math.max(maxcutts(n - a , a, b, c), Math.max(maxcutts(n - b , a, b, c), maxcutts(n - c, a, b, c))); 

        if (res == -1){
            return -1;
        }
        return res + 1;
    }
    public static void main(String[] args){
        int N = 17, A = 10 , B = 11 , C = 3;
        System.out.println(maxcutts(N, A, B, C));
    }
}
