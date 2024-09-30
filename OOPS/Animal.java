import java.util.*;

public class oops {
      public static void main(Strin args[]){
        Animal a1 = new Animal ();
    }
}

//base class
class Animal{
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathes () {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks")
    }
}

class Fish extends Animal {
    void swin() {
        System.out.println("swim");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}