public class AbubbleSort {

public static void BubbleSort(int arr[]){
    for(int turn = 0 ; turn < arr.length ; turn++){
        for(int j = 0 ; j < arr.length - 1 - turn ; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

public static void Printarr(int arr[]){
    for(int i = 0 ; i< arr.length ; i++){
        System.out.println(arr[i]);
    }
    System.out.println();
}

    public static void main(String agrs[]){
        int arr[] = {2, 3, 6, 7, 1};
        BubbleSort(arr);
        Printarr(arr);
    }
}
