import java.util.Arrays;
import java.util.Collections;

// public class Sorting_using_Builtin_methods {
//     public static void main(String[] args) {
//         // Our arr contains 8 elements
//         int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };

//         Arrays.sort(arr);

//         System.out.printf("Modified arr[] : %s",
//                 Arrays.toString(arr));
//     }
// }


// We can also use sort() to sort a subarray of arr[]. //


// public class Sorting_using_Builtin_methods {
//     public static void main(String[] args) {
//         // Our arr contains 8 elements
//         int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

//         // Sort subarray from index 1 to 4, i.e.,
//         // only sort subarray {7, 6, 45, 21} and
//         // keep other elements as it is.
//         Arrays.sort(arr, 1, 5);

//         System.out.printf("Modified arr[] : %s",
//                 Arrays.toString(arr));
//     }
// }


// We can also sort in descending order.


public class Sorting_using_Builtin_methods {
    public static void main(String[] args) {
        // Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.
        Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
    }
}