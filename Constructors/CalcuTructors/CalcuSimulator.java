package calculator;
import java.util.Scanner;
public class CalcuSimulator {
	public static void main(String[] args) 
	{
		
		CalcuApp app = new CalcuApp();
		System.out.println(app.prod());
		
		int n1 = inputInt("Enter N1");
		int n2= inputInt("Enter N2");
		
		CalcuApp $app = new CalcuApp(n1,n2);
		System.out.println("Result: "+$app.sum());
	}
	 
	private static int inputInt(String msg)
	{
		System.out.print(msg + ": ");
		Scanner inputInt = new Scanner(System.in);
	        return inputInt.nextInt();
	}
	
	private static String inputStr (String msg) 
	{
		Scanner inputSTR = new Scanner(System.in);
		System.out.print(msg + ": ");
		return inputSTR.nextLine();
	}
}
