package Arrays;

import groovy.json.JsonOutput;

import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете размер за масива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];


        scanner.nextLine();
        for (String s : Arrays.asList("Въведете 1-я елемент: ", "Въведете 2-я елемент: ", "Въведете 3-я елемент: ", "Въведете 4-я елемент: ", "Въведете 5-я елемент: ")) {
            System.out.println(s);
            scanner.nextLine();
        }
for (int i=0; i< array.length; i++) {



}

}

    }





