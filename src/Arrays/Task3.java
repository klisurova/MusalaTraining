package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете размер на първия масив: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.println("Въведете елементите на първия масив: ");

        scanner.nextLine();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.print("Въведете размер на втория масив: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        scanner.nextLine();
        for (int j = 0; j < array2.length; j++) {
            array2[j] = Integer.parseInt(scanner.nextLine());
        }

        if (array1.length == array2.length)
            System.out.println("Масивите имат еднакъв размер!");
        else System.out.println("Масивите имат различен размер!");

        if (Arrays.equals(array1, array2))
            System.out.println("Масивите са еднакви!");
        else System.out.println("Масивите са различни!");

    }
}



