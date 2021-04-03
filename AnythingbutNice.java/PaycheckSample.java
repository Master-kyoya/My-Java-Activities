package midterm;

import java.util.Scanner;

public class Paycheck 
{
	public static void main (String[]args)
	{
		String name;
		int salary, years, sales, bonus;
		double additionalBonus, paycheck; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter base salary: ");
		salary = sc.nextInt();
		System.out.print("Enter years in service: ");
		years = sc.nextInt();
		System.out.print("Enter total sales: ");
		sales = sc.nextInt();
		
		if(years <= 5)
			bonus = years * 10;
		else
			bonus = years * 20;
		
		if(sales < 5000)
			additionalBonus=0;
		else if(sales >= 5000 && sales < 10000)
			additionalBonus=sales*0.03;
		else
			additionalBonus=sales*0.06;
			
		paycheck = salary + bonus + additionalBonus;
		
		System.out.print("\nHello "+name.toUpperCase()+"! Your bonus is PhP "+bonus+" and additional bonus is PhP "+additionalBonus+". Your"
				+ " total paycheck is PhP " + paycheck);
		
		sc.close();
	}
}
