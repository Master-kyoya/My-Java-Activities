package dataStrucAssignments;

import java.util.Scanner;
import java.util.Stack;

public class MachineProblem4 {

	public static void main(String[] args) {
		System.out.println("Michael Jan R. Tangalin | 2-BSIT-2");
		System.out.println("----------------------------------");
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the Length of an Array: ");
		int arrayNum = input.nextInt();
		int array1[] = new int[arrayNum];

		System.out.println("\nPlease input " + arrayNum + " to be sorted in " + "Ascending and Descending orders.\n");

		for (int i = 0; i < array1.length; i++) {
			System.out.print("Input Value [" + i + "]: ");
			array1[i] = input.nextInt();
		}

		int numberArray = array1.length;

		sortArrayAscending(array1, numberArray);

		System.out.println("\nThe sorted values in Ascending order");

		for (int i = 0; i < numberArray; i++) {
			System.out.print(array1[i] + "\n");
		}
		sortArrayDescending(array1, numberArray);
		System.out.println("\nThe sorted values in Descending order");
		for (int i = 0; i < numberArray; i++) {
			System.out.print(array1[i] + "\n");
		}

		input.close();
	}

	static Stack<Integer> sortStackAscending(Stack<Integer> input) {
		Stack<Integer> tmpStack = new Stack<Integer>();

		while (!input.empty()) {

			int tmp = input.peek();
			input.pop();

			while (!tmpStack.empty() && tmpStack.peek() < tmp) {

				input.push(tmpStack.peek());
				tmpStack.pop();
			}

			tmpStack.push(tmp);
		}

		return tmpStack;
	}

	static void sortArrayAscending(int[] arr, int numberArray) {

		Stack<Integer> input = new Stack<Integer>();
		for (int i = 0; i < numberArray; i++)
			input.push(arr[i]);

		Stack<Integer> tmpStack = sortStackAscending(input);

		for (int i = 0; i < numberArray; i++) {
			arr[i] = tmpStack.peek();
			tmpStack.pop();
		}
	}

	static Stack<Integer> sortStackDescending(Stack<Integer> input) {
		Stack<Integer> tmpStack = new Stack<Integer>();

		while (!input.empty()) {

			int tmp = input.peek();
			input.pop();

			while (!tmpStack.empty() && tmpStack.peek() > tmp) {

				input.push(tmpStack.peek());
				tmpStack.pop();
			}

			tmpStack.push(tmp);
		}

		return tmpStack;
	}

	static void sortArrayDescending(int[] arr, int numberArray) {

		Stack<Integer> input = new Stack<Integer>();
		for (int i = 0; i < numberArray; i++)
			input.push(arr[i]);

		Stack<Integer> tmpStack = sortStackDescending(input);

		for (int i = 0; i < numberArray; i++) {
			arr[i] = tmpStack.peek();
			tmpStack.pop();
		}
	}
}
