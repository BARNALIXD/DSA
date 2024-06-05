package switchstatements;

import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1:
            System.out.println("barnali das");
                break;
                case 2:
                System.out.println("sam nanda");
                    break;
                    case 3:
                    System.out.println("palak chaurasia");
                       
                      switch (department) {
                        case "IT":
                        System.out.println("IT DEPARTMENT");
                        break;
                        case "MANAGEMENT":
                        System.out.println("MANAGEMENT");
                        break;

                      
                        default:
                        System.out.println("ENTER VALID");
                            break;
                      }
        
            default:
            System.out.println("ENTER VALID EMPLOYEE");
                break;
        }

    }
    
}
