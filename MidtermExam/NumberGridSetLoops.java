package midterms;

public class Midterm_Exam {
	public static void main(String[] args) {
		System.out.println("Michael Jan R. Tangalin");
		System.out.println("---Start---");
		int x = 21;
		int SetC_Update1 = 9;
		int SetC_Update2 = 1;

		System.out.println("Set C");

		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				System.out.print(x + "\t");

				if (col % 2 == 0) {
					x -= SetC_Update1;
				} else {
					x -= SetC_Update2;

				}
			}
			System.out.println("");
			x += 21 + SetC_Update2;
			SetC_Update1 += 2;
			SetC_Update2 -= 2;
		}
		System.out.println();
		System.out.println("Set G");
		int y = 25;
		int SetG_Update1 = 1;
		int SetG_Update2 = 9;

		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				System.out.print(y + "\t");

				if (col % 2 == 0) {
					y -= SetG_Update1;
				} else {
					y -= SetG_Update2;

				}
			}
			System.out.println("");
			y += 19 + SetG_Update2;
			SetC_Update1 += 2;
			SetC_Update2 -= 2;
		}
		System.out.println("---END---");
	}
}
