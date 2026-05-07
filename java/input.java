import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(
                "1. nextBoolean()                       Used for reading Boolean value." + //
                        "\n" + //
                        "2. nextByte()                          Used for reading Byte value." + //
                        "\n" + //
                        "3. nextDouble()                        Used for reading Double value." + //
                        "\n" + //
                        "4. nextFloat()                         Used for reading Float value." + //
                        "\n" + //
                        "5. nextInt()                           Used for reading Int value." + //
                        "\n" + //
                        "6. nextLine()                          Used for reading Line value." + //
                        "\n" + //
                        "7. nextLong()                          Used for reading Long value." + //
                        "\n" + //
                        "8. nextShort()                         Used for reading Short value." + //
                        "\n" + //
                        "9. next()                              Used for reading a single word." + //
                        "\nChoose th options:");
        int a = scn.nextInt();
        switch (a) {
            case 1:
                first(scn);
                break;

            case 2:
                second(scn);
                break;

            case 3:
                third(scn);
                break;

            case 4:
                fourth(scn);
                break;

            case 5:
                fifth(scn);
                break;

            case 6:
                sixth(scn);
                break;

            case 7:
                seventh(scn);
                break;

            case 8:
                eighth(scn);
                break;
            case 9:
                ninth(scn);
                break;
            default:
                break;
        }
    }

    // nextBoolean()
    public static void first(Scanner scn) {
        System.out.println("Allowed to Enter Boolean value: ");
        boolean a = scn.nextBoolean();
        System.out.println("You entered: " + a);
    }

    // nextByte()
    public static void second(Scanner scn) {
        System.out.println("Allowed to Enter a Byte value: ");
        byte a = scn.nextByte();
        System.out.println("You entered: " + a);
    }

    // nextDouble()
    public static void third(Scanner scn) {
        System.out.println("Allowed to Enter a Double value: ");
        double a = scn.nextDouble();
        System.out.println("You entered: " + a);
    }

    // nextFloat()
    public static void fourth(Scanner scn) {
        System.out.println("Allowed to Enter a Float value: ");
        float a = scn.nextFloat();
        System.out.println("You entered: " + a);
    }

    // nextInt()
    public static void fifth(Scanner scn) {
        System.out.println("Allowed to Enter a Integer value: ");
        int a = scn.nextInt();
        System.out.println("You entered: " + a);
    }

    // nextLine()
    public static void sixth(Scanner scn) {
        System.out.println("Allowed to Enter a Line value: ");
        String a = scn.nextLine();
        System.out.println("You entered: " + a);
    }

    // nextLong()
    public static void seventh(Scanner scn) {
        System.out.println("Allowed to Enter a Long value: ");
        long a = scn.nextLong();
        System.out.println("You entered: " + a);
    }

    // nextShort()
    public static void eighth(Scanner scn) {
        System.out.println("Allowed to Enter a Short value: ");
        short a = scn.nextShort();
        System.out.println("You entered: " + a);
    }

    // next()
    public static void ninth(Scanner scn) {
        System.out.println("Allowed to Enter a single word: ");
        String a = scn.next();
        System.out.println("You entered: " + a);
    }

}