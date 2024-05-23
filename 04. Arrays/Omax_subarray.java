public class Omax_subarray {
    public static void Max_Subarray(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i < number.length ; i++){
            for(int j = i ; j < number.length ; j++){
                currSum = 0;
                for(int k = i ; k <= j ; k++){
                    currSum += number[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max SubArray: " + maxSum);
    }
    public static void main(String args[]){
        int number[] = {2, 4, 6, 8, 10};
        Max_Subarray(number);
    }
}


