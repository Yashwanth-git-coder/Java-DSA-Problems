

import java.util.ArrayList;

public class BImplementing_ArrayList {
    public static void main(String[] args){

        int n = 5;

        // declaring ArrayList with initial size n
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);

        // Appending the new element at the end of the list
        for(int i = 1 ; i <= n ; i++){
            arrli.add(i);
        }

        // Printing elements
        System.out.println(arrli);

        // Remove element at index 3
        arrli.remove(3);

        // Displaying ArrayList after deletion
        System.out.println(arrli);

        // Printing elemnts one by one
        for(int i=0 ; i < arrli.size() ; i++){
            System.out.println(arrli.get(i)+ " ");
        }

    }
}
