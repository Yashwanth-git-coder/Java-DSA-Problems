public class Largest_Element {

    static int arr[] = { 10, 324, 45, 90, 9808 };

    static int largest(){
        int i = 0;

        int max = arr[0];
        int sma = arr[0];

        for(i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < sma){
                sma = arr[i];
            }
        }
        System.out.println("Smallest in given array " + sma);
        return max;
    }

    public static void main(String[] args){
        System.out.println("Largst in given array is " + largest());
    }
}
