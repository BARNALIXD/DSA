import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        sum();
    }
    // return the value
    static int sum(){
        Scanner in = new Scanner (System.in);
        System.out.println("enter the first num");
        int num1 = in.nextInt();
        System.out.println("enter the second num");
        int num2 = in.nextInt();
        int sum = num1 + num2 ;
        System.out.println("The sum of the two numbers are:"+sum);
        return sum;
    }
}