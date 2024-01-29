import java.util.Scanner;

public class Prifix__Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input array elements
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Input the number of queries
        System.out.print("Enter the number of queries: ");
        int q = scanner.nextInt();

        // Input queries
        System.out.println("Enter the queries (start and end indices):");
        int[][] queries = new int[q][2];
        for (int i = 0; i < q; i++) {
            System.out.print("Query " + (i + 1) + " - Start index: ");
            queries[i][0] = scanner.nextInt();
            System.out.print("Query " + (i + 1) + " - End index: ");
            queries[i][1] = scanner.nextInt();
        }

        // Calculate and print range sums
        rangeSum(arr, n, queries);

        scanner.close();
    }

    // Function to calculate and print range sums
    static void rangeSum(int[] arr, int n, int[][] queries) {
        // Calculate prefix sum
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }

        // Process queries
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            // Calculate range sum
            int ans;
            if (l == 0) {
                ans = prefix[r];
            } else {
                ans = prefix[r] - prefix[l - 1];
            }

            // Print result
            System.out.println("Sum for Query " + (i + 1) + ": " + ans);
        }
    }
}
