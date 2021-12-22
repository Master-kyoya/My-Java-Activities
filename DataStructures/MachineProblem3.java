package dataStrucAssignments;
import java.util.Scanner;
import java.util.Stack;

public class MachineProblem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack <Character>stack = new Stack<Character>();
		
		System.out.print("What is in your Mind?: ");
		String PalindromeOrNot = input.nextLine();

		System.out.println("");
		for (int i = 0; i < PalindromeOrNot.length(); i++) {
			stack.push(PalindromeOrNot.charAt(i));
		}
		String rev = "";
		
		while (!stack.isEmpty()) {
			rev = rev+stack.pop();
		}
		
		System.out.println("-----OUTPUT Reversed-----\n");
		System.out.println("\t " + rev);
		System.out.println("\n-----PalindromeOrNot-----\n");

		if (PalindromeOrNot.equals(rev)) {
			System.out.println("'" + PalindromeOrNot + "'" + " is a Palindrome!!");
		} else {
			System.out.println("'" + PalindromeOrNot + "'" + " is NOT a Palindrome!!\n");
		}

		System.out.println("\n------------END-----------");
		System.out.println("\n Michael Jan R. Tangalin\n\t2-BSIT-2");

		input.close();
	}
}


