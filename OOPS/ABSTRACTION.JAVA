public class oops {
    public static void main(String [] args) {
    Mustang myHorse = new Mustang();
    
    }
}

abstract class Animal {
    Strin color;

    Animal() {
        System.out.println("animal constructor called");
    }
    void eat() {
        System.out.println("animal eats");
    }
    abstract void walk();
}


class Horse extends Animal  {
    Horse() {
        System.out.println("Horse constructor called");
    }
    void changeColor () {
        color = "darkbrown";
    }
     void walk() {
        System.out.println("walk on 4 legs");
     }
}

class Mustang extends Horse {
    Mustang () {
        System.out.println("Mustang constructor called");
    }
    void changeColor() {
        color = "yellow";
    }
    void walk () {
        System.out.println("walks on 2 legs");
    }
}