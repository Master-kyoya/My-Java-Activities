package activity.pkg1.intro.to.methods;

import java.util.Scanner;

public class Activity1IntroToMethods {

    static int num1 = 0;
    static int num2 = 0;
    static String Ops = "";
    static int result = 0;

    public static void main(String[] args) {
        Input();
        Computation();
        results();
    }

    static void Input() {
        System.out.println("Tangalin, Michael Jan R. | 1-BSEMC-1");
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        printf("Enter Num1: ");
        num1 = inputInt.nextInt();
        printf("Enter Num2: ");
        num2 = inputInt.nextInt();
        printf("Operations (+,-,*,/,%): ");
        Ops = inputStr.nextLine();
    }

    static void Computation() {
        result = 0;
        switch (Ops) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
        }
    }

    static void results() {
        println("Results: " + result);
    }

    static void printf(String message) {
        System.out.print(message);
    }

    static void println(String message) {
        System.out.println(message);
    }
}
