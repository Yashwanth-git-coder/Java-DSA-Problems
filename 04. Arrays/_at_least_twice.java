/*
 * 
   Given an integer array nums, return true if any value appears at least twicein the
   array, and return false if every element is distinct.
 * 
 */

public class _at_least_twice {

    public static boolean least_twice(int numbers[]){
      int n = numbers.length;

      for(int i = 0 ; i < n ; i++){
        for(int j = i + 1 ; j < n ; j++){
          if(numbers[i] == numbers[j]){
            return true;
          }
        }
      }
      return false;
    }
    public static void main(String args[]){
        int numbers[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(least_twice(numbers));
    }
}

