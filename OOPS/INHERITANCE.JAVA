import java.util.*;
public class Inheritance {
    public static void main (String [] args){
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs();
        System.out.println("dobby.legs");
    }
}


class Animal{
    String color;
    void eat () {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

//derived class
// class Fish extends Animal {
//     int fins;

//     void swim () {
//         System.out.println("swims");
//     }
// }

class Mammals extends Animal {
    int legs;
}

class Dogs extends Mammal{
    String  breed;
}