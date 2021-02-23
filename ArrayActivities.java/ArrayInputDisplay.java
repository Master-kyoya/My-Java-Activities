package activty.pkg8.array;

import java.util.Scanner;

public class Activty8Array {

    public static void main(String[] args) {
        Scanner inputStr = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Tangalin, Michael Jan, R./1-BSIT-1");
        System.out.print("Enter max Record: ");
        int max = inputInt.nextInt();
        String[] Name = new String[max];
        int[] Age = new int[max];
        String[] Gender = new String[max];

        for (int i = 0; i < max; i++) {
            System.out.print("Name [" + i + "]: ");
            Name[i] = inputStr.nextLine();
            System.out.print("Age [" + i + "]: ");
            Age[i] = inputInt.nextInt();
            System.out.print("Gender [" + i + "]: ");
            Gender[i] = inputStr.nextLine();
            System.out.println("----------");
        }
        System.out.println("Name: \t\t Age: \t\t Gender");
        for (int i = 0; i < max; i++) {
            System.out.println("Name: " + Name[i] + "\t Age: " + Age[i]
                    + "\t " + Gender[i]);
        }
    }
}
