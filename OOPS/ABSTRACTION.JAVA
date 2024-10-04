public class oops {
    public static void main(String [] args) {
     Horse h = new Horse();
     h.eat();
     h.walk();

    System.out.println(h.color);
    }
}

abstract class Animal {
    Strin color;

    Animal() {
        color = "brown";
    }
    void eat() {
        System.out.println("animal eats");
    }
    abstract void walk();
}


class Horse extends Animal  {
    void changeColor () {
        color = "darkbrown";
    }
     void walk() {
        System.out.println("walk on 4 legs");
     }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }
    void walk () {
        System.out.println("walks on 2 legs");
    }
}