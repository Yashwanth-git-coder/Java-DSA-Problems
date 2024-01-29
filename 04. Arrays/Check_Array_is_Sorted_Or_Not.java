public class Check_Array_is_Sorted_Or_Not {

    public static boolean Check_Array_Sort(int arr[]){

        if(arr.length == 0 || arr.length == 1){
            return true;
        }

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i - 1] > arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int arr[] = {20, 25, 25, 28, 40, 44};

        if(Check_Array_Sort(arr)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
