import java.util.*;
public class Strings {
    public static void main(String args[]) {
      //concatination
      String firstName = "barnali";
      String secondName = "das";
      String fullName = firstName + "@ " + secondName;
      System.out.println(fullName.length());

      //charAt
      for(int i = 0; i < fullName.length(); i++){
        System.out.println(fullName.charAt(i));
      }
    }
}