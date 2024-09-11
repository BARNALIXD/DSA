import java.util.*;

public class Strings {

    public static void main(String [] args) {
        Stringbuilder sb = new Stringbuilder("Barnali);
        System.out.println(sb);

        //charAt index 0
        System.out.println(sb.charAt(0));

        //set Character at index 0
        sb.charAt(0,"p");
        System.out.println(sb);
    }
}