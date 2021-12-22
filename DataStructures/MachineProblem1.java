package dataStrucAssignments;

import java.util.Scanner;

public class MachineProblem1 {

	public static void main(String[] args) {
		System.out.println("Michael Jan R. Tangalin\n\t2-BSIT-2");
		System.out.println("------------------------");
		Scanner input = new Scanner(System.in);
		int Array1sum=0;
		int Array2sum=0;
		
		int array1[] = new int[5];
		int array2[] = new int[5];

		for (int i = 0; i < array1.length; i++) {
			System.out.print("Array1 index " + i + ": ");
			array1[i] = input.nextInt();
			Array1sum += array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.print("Array2 index " + i + ": ");
			array2[i] = input.nextInt();
			Array2sum += array2[i];
		}
		
		System.out.println("------------------------");
		double Total = Array1sum + Array2sum;
		System.out.println("Total Values: "+ Math.round(Total));
		
		double average = Total/(array1.length + array2.length);
		
		System.out.println("Average = " + average);

		input.close();
	}
}
