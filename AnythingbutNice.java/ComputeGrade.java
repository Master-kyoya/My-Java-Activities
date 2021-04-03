package finals;

import java.util.Scanner;

public class ComputeGrade 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		String student1 = "", student2 = "", student3 = "", student4 = "";
		int student1grade1 = 0, student1grade2 = 0, student1grade3 = 0, student1grade4 = 0;
		int student2grade1 = 0, student2grade2 = 0, student2grade3 = 0, student2grade4 = 0;
		int student3grade1 = 0, student3grade2 = 0, student3grade3 = 0, student3grade4 = 0;
		int student4grade1 = 0, student4grade2 = 0, student4grade3 = 0, student4grade4 = 0;
		int student1ave = 0, student2ave = 0, student3ave = 0, student4ave = 0;
		
		
		student1 = getStudentName(console,1);
		student1grade1 = getStudentGrade(console,1);
		student1grade2 = getStudentGrade(console,2);
		student1grade3 = getStudentGrade(console,3);
		student1grade4 = getStudentGrade(console,4);
		
		student2 = getStudentName(console,2);
		student2grade1 = getStudentGrade(console,1);
		student2grade2 = getStudentGrade(console,2);
		student2grade3 = getStudentGrade(console,3);
		student2grade4 = getStudentGrade(console,4);
		
		student3 = getStudentName(console,3);
		student3grade1 = getStudentGrade(console,1);
		student3grade2 = getStudentGrade(console,2);
		student3grade3 = getStudentGrade(console,3);
		student3grade4 = getStudentGrade(console,4);
		
		student4 = getStudentName(console,4);
		student4grade1 = getStudentGrade(console,1);
		student4grade2 = getStudentGrade(console,2);
		student4grade3 = getStudentGrade(console,3);
		student4grade4 = getStudentGrade(console,4);
		
		student1ave = getAverage(student1grade1, student1grade2, student1grade3, student1grade4);
		student2ave = getAverage(student2grade1, student2grade2, student2grade3, student2grade4);
		student3ave = getAverage(student3grade1, student3grade2, student3grade3, student3grade4);
		student4ave = getAverage(student4grade1, student4grade2, student4grade3, student4grade4);
		
		System.out.println("\nSUMMARY\nSTUDENT\tGRADE1\tGRADE2\tGRADE3\tGRADE4\tAVERAGE");
		displayGrade(student1, student1grade1, student1grade2, student1grade3, student1grade4, student1ave);
		displayGrade(student2, student2grade1, student2grade2, student2grade3, student2grade4, student2ave);
		displayGrade(student3, student3grade1, student3grade2, student3grade3, student3grade4, student3ave);
		displayGrade(student4, student4grade1, student4grade2, student4grade3, student4grade4, student4ave);
	}
	public static String getStudentName(Scanner console, int studentOrder)
	{
		System.out.print("Enter lastname of Student number " + studentOrder + ": ");
		String name = console.next();
		
		return name;
	}
	public static int getStudentGrade(Scanner console, int gradeOrder)
	{
		System.out.print("Enter student grade " + gradeOrder + ": ");
		int grade = console.nextInt();
		
		return grade;
	}
	public static int getAverage(int grade1, int grade2, int grade3, int grade4)
	{
		int average = (grade1 + grade2 + grade3 + grade4)/4;
		
		return average;
	}
	public static void displayGrade(String name, int grade1, int grade2, int grade3, int grade4, int average)
	{
		System.out.println(name + "\t" + grade1 + "\t" + grade2 + "\t" + grade3 + "\t" + grade4 + "\t" + average);
	}
}	
