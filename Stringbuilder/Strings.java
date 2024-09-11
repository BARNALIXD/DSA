import java.util.*;

public class Strings {

    public static void main(String [] args) {
        Stringbuilder sb = new Stringbuilder("hello");
       
       for(int i = 0; i <sb.length()/2 ; i++){
        int front = i;
        int back = sb.length() -1 - i; //5-1-0

        char frontChar = sb.charAt(front);
        char backChar = sb.charAt(back);

        sb.charAt(front, backChar);
        sb.charAt(back, frontChar);
       }
       System.out.println(sb);
    }
}