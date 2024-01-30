public class Reverse {
    static void ReverseArray(int arr[], int start, int end){
        int tmp;
        while(start < end){
            tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }

    static void printArray(int arr[], int n){
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args){
        int arr[] = {12, 134, 43, 54, 65, 76}, n = arr.length , start = 0, end = n - 1;
        printArray(arr, n);
        ReverseArray(arr, start, end);
        System.out.println("The Rversed Array : ");
        printArray(arr, n);
    }
}
