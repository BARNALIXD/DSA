package switchstatements;

import java.util.Scanner;

public class fruitalt {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruitalt = in.next();

        switch (fruitalt) {
            case "mango" -> System.out.println("king of fruits");
            case "grapes" -> System.out.println("small green fruit");
            case "strawberry" -> System.out.println("seedfull fruit");
            default -> System.out.println("enter a valid fruit");
                
        }
        
    }
}
