package activity4;

import java.util.Scanner;

public class Activity4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Michael Jan R. Tangalin");
        System.out.println("1-BSIT-1");
        System.out.print("Enter Num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Num2: ");
        int num2 = input.nextInt();

        System.out.println("---SWITCH Calculator---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Choice: ");
        int op = input.nextInt();

        if (op == 1) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (op == 2) {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (op == 3) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (op == 4) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("Invalid Choice");
        }
    }
}
