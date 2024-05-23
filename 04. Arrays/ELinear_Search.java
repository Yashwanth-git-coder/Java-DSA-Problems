public class ELinear_Search {
    public static int findElement(int marks[], int key){
        for(int i = 0; i < marks.length; i++){
            if(marks[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int marks[] = {23, 34, 56, 76};
        int key = 34;

        int index = findElement(marks, key);

        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key is at Index" + " " + index);
        }
    }
}
