package arrays;

import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a a buch of numbers in random order: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "th Number : ");
            arr[i] = scn.nextInt();
        }
        System.out.println();
        System.out.println("Choose ASCENDING -> 1 ; DESCENDING -> 2 : ");
        int choice = scn.nextInt();
        arrange(arr, choice);
        System.out.println("The sorted array: ");
        show(arr);
    }

    public static void arrange(int arr[], int num) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                switch (num) {
                    case 1:
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                        break;
                    case 2:
                        if (arr[j] < arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                        break;
                    default:
                        System.out.println("INVALID CHOICE !!!");
                        break;
                }
            }
        }
    }

    public static void show(int arr[]) {
        System.out.println("The final array is :");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + "     ");
        }
        System.err.println();
    }
}
