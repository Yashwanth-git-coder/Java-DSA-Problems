public class DDeletion {

    static int DeleteEle(int arr[], int n, int x){
        int i = 0;
        for(i = 0 ; i < n ; i++){
            if(arr[i] == x)
                break;
        }
        if(i == n){
            return n;
        }
        for(int j = i ; j < n - 1 ; j++){
            arr[j] = arr[j + 1];
        }
        return n - 1;
    }
    public static void main(String[] args){
        int arr[] = {5,6,7,8,9}, x = 6, n = 5;

        System.out.println("Before Deletion : ");

        for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i]);
        }

        System.out.println("After Deletion : ");

        n = DeleteEle(arr, n, x);

        for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
