import java.util.*;

public class Strings {

    public static void main(String [] args) {
        Stringbuilder sb = new Stringbuilder("Barnali);
        System.out.println(sb);
        
        sb.insert(0, "s');
        System.out.println(sb);

        //delete
        sb.delete(2,3);
        System.out.println(sb);
        
    }
}