public class A_oops {
    public static void main(String[] args){
        Pen p1 = new Pen();

        p1.SetColor("Blue");
        System.out.println(p1.getColor());

        p1.SetTip(5);
        System.out.println(p1.getTip());

        p1.SetColor("Yellow");
        System.out.println(p1.getColor());

        // BankAccount myacc = new BankAccount();
        // myacc.username = "Yashwanth";
        // myacc.setPassword("asdfgh");


    }
}

// class BankAccount {
//     public String username;
//     private String password;

//     public void setPassword(String pwd){
//         password = pwd;
//     }
// }

class Pen{

    String Color;
    int Tip;

    String getColor(){
        return this.Color;
    }

    String getTip() {
        return this.Color;
    }

    void SetColor(String newcolor){
        this.Color = newcolor;
    }

    void SetTip(int newtip){
        this.Tip = newtip;
    }
}
