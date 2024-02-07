public class TernarySearch {

    static int TernarySearch1(int l, int r, int arr[], int key) {

        if (r >= l) {
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;

            if (arr[mid1] == key) {
                return mid1;
            }
            if (arr[mid2] == key) {
                return mid2;
            }
            if (key < arr[mid1]) {
                return TernarySearch1(l, mid1 - 1, arr, key);
            }
            if (key > arr[mid2]) {
                return TernarySearch1(mid2 + 1, r, arr, key);
            }
            // The key lies in between mid1 and mid2
            return TernarySearch1(mid1 + 1, mid2 - 1, arr, key);
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 9, 78, 98 };
        int n = arr.length;
        int key = 9;
        int r = n - 1;
        int l = 0;

        int result = TernarySearch1(l, r, arr, key);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
