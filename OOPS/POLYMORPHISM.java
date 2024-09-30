import java.util.*;

public class Oops{
    public static void main (String args[]){
       Calculator calc = new Calculator();
       System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.4,(float)2.5));
         System.out.println(calc.sum(9,8,7));
    }
}

class Calculator {
    int sum (int a, int b){
        return a + b ;
     }

     float sum(float a, float b){
        return a + b;
     }

     int sum (int a, int b, int c){
        return a+ b+c;
     }
}
