package activity6;
import java.util.Scanner;
public class Activity6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean LoopAgain = true;
        int attempts = 1;
        int remain = 2;
        System.out.println("TANGALIN, MICHAEL JAN, R./ 1-BSIT-1");
        System.out.println("---Start Login---");
        do {
            System.out.print("Username:");
            String user = input.nextLine();
            System.out.print("Password:");
            String pass = input.nextLine();
            if (user.equals("admin") & pass.equals("12345")) {
                System.out.println("Login Success");
                LoopAgain = false;
            } else {
                System.out.println("Login failed # " + attempts + ", " + remain + " more attempts");
                if (attempts == 3) {
                    LoopAgain = false;
                    System.out.println("Login 3 attempts, Try again later");
                } else {
                    LoopAgain = true;
                }
                attempts++;
                remain--;
            }
        } while (LoopAgain);
        System.out.println("---End Login---");
    }
}
