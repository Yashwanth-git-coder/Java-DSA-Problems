public class sieve_of_eratosthenes {

    static void Sieve_of_Eratosthenes(int n){
        boolean prime[] = new boolean[n+1];
        for(int i = 0 ; i <= n ; i++){
            prime[i] = true;
        }
        for(int p = 2 ; p*p <= n ; p++){
            if(prime[p] == true){
                for(int i = p*p ; i <= n ; i += p){
                    prime[i] = false;
                }
            }
        }
        System.out.println("FOllowing are the Prime numbers \n smaller than or equal to "+ n);
        for(int i = 2 ; i < n ; i++){
            if(prime[i] == true){
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String[] args){
        int number = 10;
        Sieve_of_Eratosthenes(number);
    }
}
