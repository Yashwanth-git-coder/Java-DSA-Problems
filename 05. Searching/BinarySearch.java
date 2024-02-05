public class BinarySearch {

    static int BinarySearchEle(int arr[], int n, int x){
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            }
            else if(arr[mid] == x){
                return mid;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {20, 21, 25, 30, 38, 39, 40, 78, 90}, n = arr.length, x = 78;
        
        System.out.print(BinarySearchEle(arr, n, x));
    }
}
