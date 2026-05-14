import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String names[] = { "Pattern", "fibbinacci", "factorial", "factors", "armstrong" };
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + "." + names[i]);
        }
        System.out.print("Enter your choice :");
        int option = scn.nextInt();
        if (option == 1) {
            System.out.println("Youve choosen Pattern... ");
            Pattern();
        } else if (option == 2) {
            System.out.println("Youve choosen Fibbinacci... ");
            Fibbinacci();
        } else if (option == 3) {
            System.out.println("Youve choosen Factorial... ");
            System.out.println("Choose a number for factorial: ");
            int num = scn.nextInt();
            Factorial(num);
        } else if (option == 4) {
            System.out.println("Youve choosen Factors... ");
            System.out.print("Choose the number for factors:");
            int num = scn.nextInt();
            Factor(num);
        } else if (option == 5) {
            System.out.println("Youve choosen Armstrongs... ");
            System.out.print("Choose the limit for armstrong:");
            int num = scn.nextInt();
            Armstrong(num);
        } else {
            System.out.println("Choose a valid option: ");
        }
        System.out.println();
        scn.close();
    }

    public static void Pattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i);
            }
        }
    }

    public static void Fibbinacci() {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= 10; i++) {
            int c = a + b;
            System.out.print(c + "        ");
            a = b;
            b = c;
        }
    }

    public static void Factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.print("The factorial of " + a + "is :" + fact);
    }

    public static void Factor(int a) {
        System.out.println("The factors are: ");
        int i = 1;
        while (i <= a) {
            if (a % i == 0) {
                System.out.print(i + "    ");
            }
            i++;
        }
    }

    public static void Armstrong(int lim) {
        for (int i = 1; i <= lim; i++) {
            int digits = String.valueOf(i).length();

            int temp = i;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                if (sum > i)
                    break;
                temp /= 10;
            }
            if (sum == i) {
                System.out.print(i + "  ");
            }
        }

    }
}