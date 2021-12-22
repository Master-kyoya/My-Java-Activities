package dataStrucAssignments;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MachineProblem0 {

	public static void main(String[] args) {
		Header();
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double q1, q2, q3, prel, mid, finals;
		System.out.println("----------------------");
		System.out.print("Quiz 1 Grade: ");
		q1 = input.nextDouble();
		System.out.print("Quiz 2 Grade: ");
		q2 = input.nextDouble();
		System.out.print("Quiz 3 Grade: ");
		q3 = input.nextDouble();

		double QuizAverage = (q1 + q2 + q3) / 3;

		System.out.println("\nAverage Quiz: " + df.format(QuizAverage));

		System.out.println("----------------------");

		System.out.print("Prelim Exam: ");
		prel = input.nextDouble();
		System.out.print("Midterm  Exam: ");
		mid = input.nextDouble();
		System.out.print("Final Exam: ");
		finals = input.nextDouble();

		double finalGrade = (0.1 * prel) + (0.2 * mid) + (0.4 * finals) + (0.3 * QuizAverage);

		System.out.println("\nFinal Grade: " + df.format(finalGrade));

		String RemarksResult = "";
		double Transmutedvalue = 0.0;

		ComputeGrade(finalGrade, RemarksResult, Transmutedvalue);
		input.close();
	}

	public static void ComputeGrade(double finalGrade,
			String RemarksResult, double Transmutedvalue) {
		if (finalGrade < 75.99) {
			RemarksResult = "Failed";
			Transmutedvalue = 5.0;
		} else if (finalGrade >= 76 && finalGrade <= 78.99) {
			RemarksResult = "Passed";
			Transmutedvalue = 3.0;
		} else if (finalGrade >= 81 && finalGrade <= 84.99) {
			RemarksResult = "High Passed";
			Transmutedvalue = 2.75;
		} else if (finalGrade >= 85 && finalGrade <= 88.99) {
			RemarksResult = "Satisfactory";
			Transmutedvalue = 2.50;
		} else if (finalGrade >= 89 && finalGrade <= 91.99) {
			RemarksResult = "Very Satisfactory";
			Transmutedvalue = 2.0;
		} else if (finalGrade >= 92 && finalGrade <= 95.99) {
			RemarksResult = "Good";
			Transmutedvalue = 1.75;
		} else if (finalGrade >= 96 && finalGrade <= 99.99) {
			RemarksResult = "Very Good";
			Transmutedvalue = 1.50;
		} else {
			if (finalGrade >= 100) {
				RemarksResult = "Excellent";
				Transmutedvalue = 1.0;
			}
		}
		System.out.println("----------------------");
		System.out.println("Remarks: " + RemarksResult);
		System.out.println("Transmuted grade: " + Transmutedvalue);
	}
	public static void Header() {
		System.out.println("Michael Jan R. Tangalin\n\t2-BSIT-2");
		System.out.println("--WANBOL UNIVERSITY--");
		System.out.println("<< GRADING SYSTEMS >>");
	}
}
