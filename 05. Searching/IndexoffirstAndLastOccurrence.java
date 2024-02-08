public class IndexoffirstAndLastOccurrence {

    static int first(int arr[], int find,  int n){
        int low = 0, high = n - 1, res = -1;
        while(low <=  high){
            int mid = (low + high) / 2;
            if(arr[mid] > find){
                high = mid - 1;
            }
            else if(arr[mid] < find){
                low = mid + 1;;
            }
            else{
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }

    static int last(int arr[], int x, int n) {
        int low = 0, high = n - 1, res = -1;
        while (low <= high) {
            // Normal Binary Search Logic
            int mid = (low + high) / 2;
            if (arr[mid] > x)
                high = mid - 1;
            else if (arr[mid] < x)
                low = mid + 1;

            // If arr[mid] is same as x,
            // we update res and move to
            // the right half.
            else {
                res = mid;
                low = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] argss){
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8}, n = arr.length, find = 13;

        System.out.println("First Occurrence = " + first(arr, find, n));

        System.out.println("Last Occurrence = " + last(arr, find, n));
    }
}
