public class NToOne {

    static void PrintReverseOrder(int n){
        if(n<1)
            return;
        else{
            System.out.println(n + " ");
            PrintReverseOrder(n - 1);
        }

    }
    public static void main(String[] args) {
        int number = 10;
        PrintReverseOrder(number);
    }
}

