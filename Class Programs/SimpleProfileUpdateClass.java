package DUMMY;

import java.util.Scanner;

public class CodeDummy {
	String name;
	int Idnum;
	
	public CodeDummy() {
		name = "Makarov";
		Idnum = 5348;
	}
	public CodeDummy(String pangalan, int infoID)
	{
		name = pangalan;
		Idnum = infoID;
	}
	public String getName()
	{
		return name;
	}
	
	public int getIdInfo()
	{
		return Idnum;
	}
	
	public void setName()
	{
		name = inputString("Set new Name");
	}
	
	public void setnewID()
	{
		Idnum = inputInt("Set new Id");
	}
	public static void main(String[] args) {
		CodeDummy pangalan1 = new CodeDummy();
		CodeDummy infoID1 = new CodeDummy();
		
		System.out.println("---MAIN MENU---");
		
		System.out.println("Name: " + pangalan1.getName());
		System.out.println("ID Number: " + infoID1.getIdInfo());
		
		System.out.println("---Reset Account---");
		
		pangalan1.setName();
		infoID1.setnewID();
		
		System.out.println("---NEW UPDATE---");
		
		
		System.out.println("Name: " + pangalan1.getName()+
				"\n"+"ID Number: " + infoID1.getIdInfo());
	}
	
	private static int inNum() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
	
	private static String inSTR() {
        Scanner inputstr = new Scanner(System.in);
        return inputstr.nextLine();
    }
	private static String inputString(String msg) 
	{
        p(msg + ": ");
        String val = inSTR();
        return val;
    }
	private static int inputInt(String msg)
	{
		 p(msg + ": ");
	        int val = inNum();
	        return val;
	}
	
    public static void p(String Msg) {
        System.out.print(Msg);
    }

    public static void pl(String Msg) {
        System.out.println(Msg);
    }
}
