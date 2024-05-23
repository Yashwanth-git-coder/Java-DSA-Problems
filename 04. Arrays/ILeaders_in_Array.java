public class ILeaders_in_Array {

    void PrintLeaders(int arr[], int n){
        int max_from_right = arr[n - 1];
        System.out.print(max_from_right + " ");

        for(int i = n - 2 ; i > 0 ; i--){
            if(max_from_right < arr[i]){
                max_from_right = arr[i];
                System.out.print(max_from_right + " ");
            }
        }
    }
    public static void main(String[] args){
        ILeaders_in_Array lead = new ILeaders_in_Array();
        int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;
        lead.PrintLeaders(arr, n);
    }
}
