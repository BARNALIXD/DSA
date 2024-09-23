public class oops{
    public static void main (String[] args){
        Pen p1 = new Pen();// created a pen object called p1
        p1.setColor("pink");
        System.out.println(p1.color);
        p1.setTip = "5";
        System.out.println(p1.setTip);
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