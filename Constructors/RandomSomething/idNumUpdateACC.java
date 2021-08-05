package DUMMY;

import java.util.*;

public class CodeDummy {
	String name;
	int Idnum;

	public CodeDummy() {
		name = "Makarov";
		Idnum = 5348;
	}

	public CodeDummy(String pangalan, int infoID) {
		name = pangalan;
		Idnum = infoID;
	}

	public String getName() {
		return name;
	}

	public int getIdInfo() {
		return Idnum;
	}

	public void setName() {
		name = inputSTR("Set new Name");
	}

	public void setnewID() {
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

		System.out.println("Name: " + pangalan1.getName() + "\n" + "ID Number: " + infoID1.getIdInfo());
	}

	private static String inputSTR(String msg) {
		Scanner inputstr = new Scanner(System.in);
		p(msg + ": ");		
		return inputstr.nextLine();
	}

	private static int inputInt(String msg) {
		Scanner inputInt = new Scanner(System.in);
		p(msg + ": ");
		
		return inputInt.nextInt();
	}

	public static void p(String Msg) {
		System.out.print(Msg);
	}

	public static void pl(String Msg) {
		System.out.println(Msg);
	}
}
