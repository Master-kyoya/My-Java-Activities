package activity2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Activity2 
{
	static DecimalFormat df = new DecimalFormat("$##,###.00");
	static Scanner inputFile;
	static PrintWriter outputFile;
	static String rowdata, fname, lname, name;
	static String[] specificrow = new String[6];
	static double 
			q1 = 0.0, 
			q2 = 0.0, 
			q3 = 0.0, 
			q4 = 0.0, 
			agentSalesAve = 0.0, 
			OverAllSales = 0.0, 
			OverAllSalesAve = 0.0;
	
	static int agentCounter;
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		openfile();	
		processfile();
		closefile(); 
	}
	
	public static void openfile() throws FileNotFoundException 
	{
		inputFile = new Scanner(new FileReader("../Ifelse/src/activity2/SalesData.csv"));
		outputFile = new PrintWriter("../Ifelse/src/activity2/SalesData.txt");
	}
	public static void processfile()
	{
		printHeader();
		//row data
		while(inputFile.hasNext())
		{
			rowdata = inputFile.nextLine();
			specificrow = rowdata.split(",");
			
			fname = specificrow[0];
			lname = specificrow[1];
			
			name = 	lname.toUpperCase() + ", "+ fname;
			
			q1 = Double.parseDouble(specificrow[2]);
			q2 = Double.parseDouble(specificrow[3]);
			q3 = Double.parseDouble(specificrow[4]);
			q4 = Double.parseDouble(specificrow[5]);
			
			agentSalesAve = (q1+q2+q3+q4)/4;
			
			OverAllSales +=  agentSalesAve;
			
			
			outputFile.println(name +"\t"+ df.format(q1)+"\t"+df.format(q2)+"\t"+df.format(q3)+"\t"+df.format(q4)+"\t" + df.format(agentSalesAve));
			
			agentCounter++;
		}
		outputFile.println();
		OverAllSalesAve = OverAllSales/agentCounter;
		outputFile.println("Overall Average Sales of Agent for the year: " + df.format(OverAllSalesAve));
		outputFile.println("-----------------------------------------------------------------------------------------------");
		addrecord();
	}
	public static void printHeader()
	{
		outputFile.println("MoonLife");
		outputFile.println("Agents Quarterly Report");
		outputFile.println();
		outputFile.println("Agent Name\tQuarter1\tQuarter2\tQuarter3\tQuarter4\tAverage Sales");
		outputFile.println();
	}
	
	public static void closefile()
	{
		inputFile.close();
		outputFile.close();
	}
	public static void addrecord()
	{
		try {
			FileWriter file = new FileWriter("../Ifelse/src/activity2/SalesData102.txt");
			BufferedWriter BW = new BufferedWriter(file);
			
			String agentName = inputStr("Enter Agent Name");
			
			BW.write(agentName);

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String inputStr(String msg)
	{
		Scanner inputStr = new Scanner(System.in);
		System.out.print(msg + ": ");
		return inputStr.nextLine();
	}
	
	public static int inputInt(String msg)
	{
		Scanner inputInt = new Scanner(System.in);
		System.out.print(msg + ": ");
		return inputInt.nextInt();
	}
	
}
