
public class RRemoveDuplicate {

    static int RemoveDuplicat(int arr[], int n){
        int res = 1;
        for(int i = 1 ; i < n ; i++){
            if(arr[res - 1] != arr[i]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int arr[] = {2,2,3,3,3,9,9}, n = arr.length;
      
        System.out.println("Before Remove Duplicating");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
        System.out.println("After Remove Duplicating :");

        n = RemoveDuplicat(arr, n);

        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
    }
}





// Scanner as = new Scanner(System.in);
// int nr = as.nextInt();