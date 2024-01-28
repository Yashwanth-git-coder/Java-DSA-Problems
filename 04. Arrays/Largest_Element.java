public class Largest_Element {

    static int arr[] = { 10, 324, 45, 90, 9808 };

    static int largest(){
        int i = 0;

        int max = arr[0];

        for(i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        System.out.println("Largst in given array is " + largest());
    }
}
