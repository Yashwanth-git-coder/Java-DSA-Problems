public class A_oops {
    public static void main(String[] args){
        Pen p1 = new Pen();

        p1.SetColor("Blue");
        System.out.println(p1.Color);

        p1.SetTip(5);
        System.out.println(p1.Tip);

        p1.SetColor("Yellow");
        System.out.println(p1.Color);

    }
}

class Pen{

    String Color;
    int Tip;

    void SetColor(String newcolor){
        Color = newcolor;
    }

    void SetTip(int newtip){
        Tip = newtip;
    }
}
