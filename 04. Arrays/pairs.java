public class pairs {
    public static void GetPairs(int arr[]){
        int total_pairs = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int cur = arr[i];
            for(int j = i + 1 ; j < arr.length ; j++){
                total_pairs = total_pairs + 1;
                System.out.print("(" + cur + "," + arr[j] + ")");
            }
            System.out.println();
           
        }
        System.out.println(total_pairs);
    }

    public static void main(String args[]){
        int arr[] = {2, 4, 6, 8, 10};
        GetPairs(arr);
    }
}
