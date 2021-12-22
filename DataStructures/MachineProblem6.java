package dataStrucAssignments;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MachineProblem6 {

	public static void main(String[] args) {
		System.out.println("Michael Jan R. Tangalin\n2-BSIT-2");
		Scanner input = new Scanner(System.in);
		int Choice = 0;
		do {
			System.out.println("---MENU---");
			System.out.println("1. Enqueue\n" + 
							"2. Dequeue\n" + 
							"3. IsEmpty\n" + 
							"4. IsFull\n" + 
							"5. Peek\n" + 
							"6. Exit");
			System.out.print("\nEnter your Choice: ");
			Choice = input.nextInt();
			System.out.print("\n");
			if (Choice == 1) {
				System.out.print("Enter element to enquee: ");
				input.nextLine();
				enqueue(input.nextLine());
			} else if (Choice == 2) {
				dequeue();
			} else if (Choice == 3) {
				System.out.println("is empty: " + isEmpty());
			} else if (Choice == 4) {
				System.out.println("is Full: " + isFull());
			} else if (Choice == 5) {
				Peek();
			} else if (Choice == 6) {
				System.out.println("---System Exit---");
				System.exit(0);
			} else {
				System.out.println("Invalid Choice!");
			}
			System.out.print("-------------------\n");
			System.out.println("Object List: \n" + obj);
			System.out.print("-------------------\n");

		} while (Choice != 6);
		input.close();
	}

	private static Queue<Object> obj = new LinkedList<Object>();

	public static void enqueue(Object something) {
		if (!isFull()) {
			obj.add(something);
		} else {
			System.out.println("QUEUE IS FULL!");
		}
	}

	public static void dequeue() {
		if (!isEmpty()) {
			obj.remove();
			System.out.println("OBJECT REMOVED");
		} else {
			System.out.println("\nList is already empty");
		}
	}

	public static boolean isFull() {
		int max = 5;
		if (max == obj.size()) {
			return true;
		} else
			return false;
	}

	public static boolean isEmpty() {
		if (obj.isEmpty()) {
			return true;
		}
		return false;
	}

	public static void Peek() {
		if (!isEmpty()) {
			System.out.println("Front element: " + obj.peek());
		} else {
			System.out.println("Cannot peek, list is empty");
		}
	}

}
