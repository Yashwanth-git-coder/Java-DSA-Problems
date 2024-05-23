import java.util.*;

public class NMin_Max_E {

    static int[] getMinMax(int arr[], int n){
        int[] minmax = new int[2];

        if(n > 0){
            Arrays.sort(arr);
            minmax[0] = arr[0];
            minmax[1] = arr[n - 1];
        }
        return minmax;
    }
    public static void main(String[] args){
        int arr[] = {2, 4, 8, 2, 9 ,1, 8 ,12, 5, 6 , 7}, n = arr.length;
        int[] minmax = getMinMax(arr, n);
        System.out.println("Minimum element is " + minmax[0]);
        System.out.println("Maximum element is " + minmax[1]);
    }
}
