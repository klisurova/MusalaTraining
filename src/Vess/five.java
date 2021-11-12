package Vess;
import java.util.Scanner;

public class five {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();
    int calc = num1*num2;
        System.out.println(num1 + " x " + num2 + " = " + calc );
    }
}
