public class E_Char_At {

    public static void printChar(String str){
        for(int i = 0 ; i < str.length() ; i++ ){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        String firstname = "Yashwanth";
        String lastname = "Shivaraju";
        String name = firstname + " " + lastname;
        
        printChar(name);
    }
}
