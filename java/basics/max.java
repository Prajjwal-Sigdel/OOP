import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter three numbers : (a b c) ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int result = compare(a, b, c);
        System.out.println("The largest number is: " + result);
        scn.close();
    }

    public static int compare(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }
}