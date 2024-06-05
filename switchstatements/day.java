package switchstatements;

import java.util.Scanner;

public class day {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String day = in.next();

        switch (day) {
            case "Monday" -> System.out.println("first day of the week");
            case "Tuesday" -> System.out.println("Second day of the week");
            case "Wednesday" -> System.out.println("Third day of the week");
            case "Thursday" -> System.out.println("Fourth day of the week");
            case "Friday" -> System.out.println("fifth day of the week");
            case "Saturday" -> System.out.println("sixth day of the week");
            case "Sunday" -> System.out.println("holiday day of the week");
            default-> System.out.println("not a valid input");
               
        }
    }
}
