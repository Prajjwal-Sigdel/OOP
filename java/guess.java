/*
If the guessed number is bigger than the actual number, the program will respond with the message that the guessed number is higher than the actual number.
If the guessed number is smaller than the actual number, the program will respond with the message that the guessed number is lower than the actual number.
If the guessed number is equal to the actual number or if the K trials are exhausted, the program will end with a suitable message.
 */

import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner bipul = new Scanner(System.in);
        System.out.println("Enter a number to guess: ");
        int num = bipul.nextInt();
        int attempts = 1;
        while (attempts <= 5) {
            System.out.print("Guess the number: ");
            int guess = bipul.nextInt();
            if (guess == num) {
                System.out.println("You've guessed it right !!!");
                break;
            } else {
                if (guess > num)
                    System.out.println("The number is Higher...");
                else
                    System.out.println("The number is Lower...");

                if (attempts < 5)
                    System.out.println("Try again");
                else
                    System.out.println("You've ran out of attempts");
                attempts++;
            }
        }

        bipul.close();
    }
}
