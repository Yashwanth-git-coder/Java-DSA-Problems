import java.util.Arrays;

public class Sorting_using_Builtin_methods {
    public static void main(String[] args) {
        // Our arr contains 8 elements
        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };

        Arrays.sort(arr);

        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
    }
}
