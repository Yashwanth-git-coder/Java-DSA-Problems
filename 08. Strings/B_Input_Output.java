import java.util.*;

public class B_Input_Output {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String name;
            name = sc.nextLine();
            System.out.println(name);
        }
    }
}
