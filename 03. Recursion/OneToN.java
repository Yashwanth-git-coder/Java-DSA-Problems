public class OneToN {

    static void PrintNos(int initial , int last){
        if(initial <= last){
            System.out.println(initial + " ");
            PrintNos(initial + 1, last);
        }
    }
    public static void main(String[] args){
        PrintNos(1, 10);
    }
}
