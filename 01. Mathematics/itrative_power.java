public class itrative_power {

    static int Power(int x, int y){
        int res = 1;
        while (y > 0) {
            if(y % 2 != 0){
                res = res * x;
            }
            y = y/2;
            x = x * x;
        }
        return res;
    }
    public static void main(String[] args){
        int x = 5, y = 2;
        System.out.println("The Itretive power of " + x + " and " + y + " is : " + Power(x, y));
    }
}
