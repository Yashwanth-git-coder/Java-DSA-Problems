 package Arrays;
 
 /**
  * Implementing_Arrays
  */
 public class Implementing_Arrays {
 
    public static void main(String[] args){
        // Declaring the array of integer
        int []arr;

        // Allocating memory for 5 integrs
        arr = new int[5];

        // Initializing the first element in the array
        arr[0] = 5;

        // Initializing the second element in the array
        arr[1] = 10;

        //so on......

        arr[3] = 15;
        arr[4] = 20;
        //arr[5] = 25;

        // Accessing the elements of the specified array
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("Element at index " + i + " : " + arr[i]);
        }
    }
 }
 