public class CInsertion {

    static int insert(int[] arr, int n, int pos, int cap, int x) {
        if (cap == n) {
            System.out.println("Array is full. Cannot insert.");
            return n;
        }

        int idx = pos - 1;

        for (int i = n - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }
        arr[idx] = x;

        return (n + 1);
    }

    public static void main(String[] args) {
        int n = 3;
        int arr[] = new int[5], cap = 5;

        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;

        System.out.println("Before Insertion : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        int x = 3, pos = 2;

        n = insert(arr, n, pos, cap, x);

        if (n <= arr.length) {
            System.out.println("After Insertion : ");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
