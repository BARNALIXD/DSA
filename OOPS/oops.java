public class oops{
    public static void main (String[] args){
        Pen p1 = new Pen();// created a pen object called p1
        p1.setColor("pink");
        System.out.println(p1.color);
        p1.setTip = "5";
        System.out.println(p1.Tip);
        //it is not compulsary that we cannot change the color further we can change it
        p1.setColor ="red";
        System.out.println(p1.solor);

    BankAccount myAcc = new BankAccount();
     myAcc.username= "barnaliDas";
     myAcc.setPassword = "abcedefg";
    }
}
class BankAccount{
     default String username;
     private String password;

     public void setPassword(String pwd) {
        password = pwd;
     }

     

}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color  = newColor;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
}

class student {
    String name;
    int age;
    float percentage;

    void calcPercentage (int phy, int chem , int bio){
        percentage = (phy+chem+bio)/3;
    }
}