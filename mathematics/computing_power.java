public class computing_power {
    static int Computing_Power(int x, int y){
        int temp;
        if(y == 0){
            return 1;
        }
        temp = Computing_Power(x, y/2);
        if(y % 2 == 0){
            return temp * temp;
        }
        else{
            return x * temp * temp;
        }
    }
    public static void main(String[] args){
        int x = 2, y = 3;
        System.out.println("Power of " + x + " and " + y + " is : " + Computing_Power(x,y));
    }
}
