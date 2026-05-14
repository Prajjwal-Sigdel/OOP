
/*
nextBoolean()                       Used for reading Boolean value.

nextByte()                          Used for reading Byte value.

nextDouble()                        Used for reading Double value.

nextFloat()                         Used for reading Float value.

nextInt()                           Used for reading Int value.

nextLine()                          Used for reading Line value.

nextLong()                          Used for reading Long value.

nextShort()                         Used for reading Short value.

next()                              Used for reading a single word
*/
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scn.nextInt();

        System.out.print("Enter the second number: ");
        float b = scn.nextFloat();

        System.out.println("Sum : " + (a + b));
        scn.close();
    }
}