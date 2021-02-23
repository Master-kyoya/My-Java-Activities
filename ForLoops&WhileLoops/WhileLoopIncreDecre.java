package activity5;

import java.util.Scanner;

public class Activity5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Michael Jan R. Tangalin" + "/1-BSIT-1");
		System.out.print("Update by: Increment/Decrement: ");
		String Updateby = input.nextLine();
		System.out.print("Enter Starting Number: ");
		int StartNum = input.nextInt();
		System.out.print("Enter Update Number: ");
		int UpdateNum = input.nextInt();
		System.out.print("Enter End Number: ");
		int EndNum = input.nextInt();
		if (Updateby.equals("Increment")) {
			int loop = 1;
			while (StartNum <= EndNum) {
				System.out.println("Loop#" + loop + ":" + " value=" + StartNum);
				loop++;
				StartNum += UpdateNum;
			}
		} else if (Updateby.equals("Decrement")) {
			int loop = 1;
			while (StartNum >= EndNum) {
				System.out.println("Loop#" + loop + ":" + " value=" + StartNum);
				loop++;
				StartNum -= UpdateNum;
			}
		}
	}
}
