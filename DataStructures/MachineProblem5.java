package dataStrucAssignments;

import java.util.Stack;
import java.util.Scanner;

public class MachineProblem5 {

	public static void main(String[] args) {
		System.out.println("Michael Jan R. Tangalin\n2-BSIT-2");
		Scanner input = new Scanner(System.in);
		int Choice = 0;
		do {
			System.out.println("---MENU---");
			System.out.println("1. Push Object " + 
			"\n2. Pop Object" + "\n3. Exit");
			System.out.print("\nInput your Choice: ");
			Choice = input.nextInt();

			switch (Choice) {
			case 1:
				System.out.print("\nInput object Element: ");
				input.nextLine();
				obj.push(input.nextLine());
				break;
			case 2:
				POPObject();
				break;
			case 3:
				System.out.println("---System Exit---");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice!");
				break;
			}
			System.out.println("----------------------");
			displayObjects();
			System.out.println("----------------------");
			PeektopObject();
			System.out.println("Number of object elements: " + numberOfStacks());
			System.out.println("----------------------");
			System.out.print("\n");

		} while (Choice != 3);
		input.close();
	}

	public static Stack<Object> obj = new Stack<Object>();

	public static void POPObject() {
		if (CheckStack()) {
			System.out.println("Can't Pop Empty Object!");
		} else {
			obj.pop();
			System.out.println("TOP OBJECT REMOVED");
		}
	}

	public static void PeektopObject() {
		if (obj.isEmpty()) {
			System.out.println("Object is Empty!");
		} else {
			System.out.println("Top Element Object: " + obj.peek());
		}
	}

	public static void displayObjects() {
		System.out.println("Object List: \n" + obj);
	}

	public static int numberOfStacks() {
		return obj.size();
	}

	public static boolean CheckStack() {
		if (!obj.isEmpty()) {
			return false;
		} else
			return true;
	}
}
