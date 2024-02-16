import java.util.Arrays;
import java.util.Collections;
import java.util.*;

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


// public class Sorting_using_Builtin_methods {
//     public static void main(String[] args) {
//         // Note that we have Integer here instead of
//         // int[] as Collections.reverseOrder doesn't
//         // work for primitive types.
//         Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

//         // Sorts arr[] in descending order
//         Arrays.sort(arr, Collections.reverseOrder());

//         System.out.printf("Modified arr[] : %s",
//                 Arrays.toString(arr));
//     }
// }

// We can also sort strings in alphabetical order

// public class Sorting_using_Builtin_methods {
//     public static void main(String[] args) {
//         String arr[] = { "practice.geeksforgeeks.org",
//                 "quiz.geeksforgeeks.org",
//                 "code.geeksforgeeks.org"
//         };

//         // Sorts arr[] in ascending order
//         Arrays.sort(arr);
//         System.out.printf("Modified arr[] : \n%s\n\n",
//                 Arrays.toString(arr));

//         // Sorts arr[] in descending order
//         Arrays.sort(arr, Collections.reverseOrder());

//         System.out.printf("Modified arr[] : \n%s\n\n",
//                 Arrays.toString(arr));
//     }
// }

// We can also sort an array according to user defined criteria:

// A class to represent a student.
class Point {
    int x, y;

    Point(int i, int j) {
        x = i;
        y = j;
    }
}

class MySort implements Comparator<Point> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(Point a, Point b) {
        return a.x - b.x;
    }
}

// Driver class
class Main {
    public static void main(String[] args) {
        Point[] arr = { new Point(10, 20), new Point(3, 12), new Point(5, 7) };
        Arrays.sort(arr, new MySort());
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i].x + " " + arr[i].y);
    }
}