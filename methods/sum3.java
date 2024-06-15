import java.util.Scanner;

public class sum() {
    public static void Main (String[] args){
        int ans = (20 ,30);
        System.out.println("The sum :" +ans);
    }

    static int sum3(int a , int b) {
        int sum = (a+b);
        return sum;
    }
    Scanner in = new Scanner(System.in);
    System.out.println("enter the first element:");
    int num1= in.nextInt();
    System.out.println("enter the second element:");
    int num2= in.nextInt();
    int sum = (num1 +num2);
    System.out.println("the sum of the two numbers are:"+sum);

}