public class RecursiveBinarySearch {
    static int BinarySearchEle(int arr[],int low, int high, int n, int x) {
        

        if (high >= low) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                return BinarySearchEle(arr, low, mid -1, n, x);
            } else if (arr[mid] == x) {
                return mid;
            } else {
                return BinarySearchEle(arr, mid + 1, high, n, x);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 }, n = arr.length, x = 10;
        int low = 0, high = n - 1;

        System.out.print(BinarySearchEle(arr, low, high, n, x));
    }
}
