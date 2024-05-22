public class maxSubArray_prefix {
    public static void Max_Subarray(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];

        for(int i = 1 ; i < prefix.length ; i++){
            prefix[i] = prefix[i - 1] + number[i];
        }

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {

                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                
            }
            System.out.println();
        }
        System.out.println("Max SubArray: " + maxSum);
    }

    public static void Kadans(int number[]){
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0 ; i < number.length ; i++){
            cursum = cursum + number[i];
            if(cursum < 0){
                cursum = 0;
            }
            maxsum = Math.max(cursum, maxsum);
        }
        System.out.println("Max Sum :" + maxsum);
    }

    public static void main(String args[]) {
        int number[] = {2, 4, 6, 8, 10 };
        Kadans(number);
    }
}
