package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете число: ");
        int input = scanner.nextInt();
        int[] array = new int[10];
        array[0] = input;
        array[1] = input;
        System.out.print(input + " " + input + " ");

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
            System.out.print(array[i] + " ");
        }

    }
}
