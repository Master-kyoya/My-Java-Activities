package activity.pkg7;
public class Activity7 {
    public static void main(String[] args) {
        System.out.println("Tangalin,Michael Jan, R./1-BSIT-1");
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("A");
            }
            System.out.println("");
        }
        for (int a = 1; a <= 4; a++) {
            for (int b = 4; b >= a; b--) {
                System.out.print("A");
            }
            System.out.println("");
        } System.out.println("----------");
        for (int a = 1; a <= 5; a++) {
            for (int b = a; b <= 4; b++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= a; b++) {
                System.out.print("B");
            }
            System.out.println("");
        }
        for (int a = 1; a <= 4; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for (int b = a; b <= 4; b++) {
                System.out.print("B");
            }
            System.out.println("");
        } System.out.println("----------");
        for (int a = 1; a <= 5; a++) {
            for (int b = a; b <= 5; b++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= a + (a - 1); b++) {
                System.out.print("C");
            }
            System.out.println("");
        }System.out.println("-----------");
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for (int b = a; b <= 5 + (5 - a); b++) {
                System.out.print("D");
            }
            System.out.println("");
        }
    }
}
