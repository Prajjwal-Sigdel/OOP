import java.util.Scanner;

public class decision {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("\n Enter Your Method and choice\n 1.if-else-if \n 2.Switch-case\n");
        int choice = scn.nextInt();
        System.out.println("Now Choose the Number of the day: (1-7)");
        int day = scn.nextInt();
        if (choice == 1) {
            System.out.println("You've choosen If-Else-If...");
            System.out.print("The day is: ");
            iffer(day);
        } else if (choice == 2) {
            System.out.println("You've choosen Switch-Case...");
            System.out.print("The day is: ");
            switcher(day);
        } else {
            System.out.println("Method Unavailable...");
        }
        scn.close();
    }

    public static void iffer(int day) {
        if (day == 1) {
            System.out.println("Sunday.");
        } else if (day == 2) {
            System.out.println("Monday.");
        } else if (day == 3) {
            System.out.println("Tuesday.");
        } else if (day == 4) {
            System.out.println("Wednesday.");
        } else if (day == 5) {
            System.out.println("Thursday.");
        } else if (day == 6) {
            System.out.println("Friday.");
        } else if (day == 7) {
            System.out.println("Saturday.");
        } else {
            System.out.println("Try again...");
        }
    }

    public static void switcher(int day) {
        switch (day) {
            case 1:
                System.out.println("Sunday.");
                break;
            case 2:
                System.out.println("Monday.");
                break;
            case 3:
                System.out.println("Tuesday.");
                break;
            case 4:
                System.out.println("Wednesday.");
                break;
            case 5:
                System.out.println("Thursday.");
                break;
            case 6:
                System.out.println("Firday.");
                break;
            case 7:
                System.out.println("Saturday.");
                break;
            default:
                System.out.println("Try again...");
                break;
        }
    }
}