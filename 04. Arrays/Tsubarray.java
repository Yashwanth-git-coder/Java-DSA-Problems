public class Tsubarray {
    public static void SubArray(int numbers[]){
        int ts = 0;
        int sum = 0;
        for(int i = 0 ; i < numbers.length ; i++){
            for(int j = i ; j < numbers.length ; j++){
                for(int k = i ; k <= j ; k++){
                    System.out.print(numbers[k] + " "); 
                }
                sum = sum + numbers[j];
                System.out.print(" Sum is : " + sum);
                ts++;
                System.out.println();
            }
            System.out.println();
            
        }
        System.out.println(ts);
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};

        SubArray(numbers);
    }
}
