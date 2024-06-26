import java.util.*;

public class A_creation {

    public static boolean Search(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key){
                    System.out.print("Key Found at : " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not Found");
        return false;
    }

    public static void main(String[] args){
        int matrix[][] = new int[3][3];
        int n = matrix.length; int m = matrix[0].length;

        try (Scanner in = new Scanner(System.in)) {
            for(int i = 0; i < n ; i++){
                for(int j = 0 ; j < m ; j++){
                    matrix[i][j] = in.nextInt();
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        Search(matrix, 10);

    }
}
