package switchstatements;

import java.util.Scanner;

public class fruits {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String fruits= in.next();

        switch ("fruits") {
            case "mango":
            System.out.println("king of fruits");
                
                break;
                case "grape":
                System.out.println("small green fruit");
                    
                    break;    
                    case "strawberry":
                    System.out.println("seedfull fruits");
                        
                        break;
        
            default:
            System.out.println("the fruit you ahave entered is not a fruit");
                break;
        }

    }
    
}
