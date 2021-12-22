package dataStrucAssignments;

import java.util.Scanner;

public class MachineProblem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Michael Jan R. Tangalin\n2-BSIT-2");
		System.out.println("------------------------");
		System.out.print("Input Number of rows: ");
		int rows = input.nextInt();
		System.out.print("Input Number of Columns: ");
		int cols = input.nextInt();

		int array1[][] = new int[rows][cols];
		int array2[][] = new int[rows][cols];

		System.out.println("------------------------");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Array1 " + "[" + i + "]" + "[" + j + "]: ");
				array1[i][j] = input.nextInt();
			}
		}
		System.out.println("------------------------");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Array2 " + "[" + i + "]" + "[" + j + "]: ");
				array2[i][j] = input.nextInt();
			}
		}

		System.out.println("\t\t---OUTPUT---");

		for (int x = 0; x < rows; x++) {
			for (int y = 0; y < cols; y++) {
				System.out.println("Array 1 " + "[" + x + "]" + "[" + y + "]" + ": " + array1[x][y] + "\t" + "Array 2 "
						+ "[" + x + "]" + "[" + y + "]" + ": " + array2[x][y]);
			}
		}
		double sum = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sum += array1[i][j] + array2[i][j];
			}
		}
		System.out.println("------------------------");
		System.out.println("The Total Sum of Array1 and Array2 is: " + Math.round(sum));

		int totalArrays = array1.length + array2.length;

		double average = sum / totalArrays;

		System.out.println("The average of Array1 and Array2 is: " + average);

		input.close();
	}
}
