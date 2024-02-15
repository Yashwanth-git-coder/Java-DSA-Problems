public class TwoPointer {

    static boolean TowPointers(int arr[], int n, int x){
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] + arr[j] == x) {
                return true;
            }
            else if(arr[i] + arr[j] < x){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
     public static void main(String[] args){
        int arr[] = {2, 5, 8, 12, 30}, n = arr.length, x = 17;

        System.out.println(TowPointers(arr, n, x));
     }
}
