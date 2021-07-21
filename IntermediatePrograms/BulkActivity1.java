package bulk.activity.pkg1;

import java.util.Scanner;

public class BulkActivity1 {

    public static void main(String[] args) {
        pl("TANGALIN, MICHAEL JAN R. | 1 - BSEMC - 1");
        InputNum();
    }

    static void InputNum() {
        int number = inputInt("\nEnter Number");
        Process(number);
    }

    static void Process(double InputNumS) {
        if ((InputNumS > 0) && (InputNumS < 5)) {
            if (InputNumS % 2 == 0) {
                pl("AAA");
            } else {
                pl("BBB");
            }
        } else if ((InputNumS > 20) && (InputNumS < 25)) {
            if (InputNumS % 2 == 0) {
                pl("AAA");
            } else {
                pl("BBB");
            }
        } else if ((InputNumS > 40) && (InputNumS < 45)) {
            if (InputNumS % 2 == 0) {
                pl("AAA");
            } else {
                pl("BBB");
            }
        } else if ((InputNumS > 10) && (InputNumS < 15)) {
            if (InputNumS % 2 == 0) {
                pl("CCC");
            } else {
                pl("DDD");
            }
        } else if ((InputNumS > 30) && (InputNumS < 35)) {
            if (InputNumS % 2 == 0) {
                pl("CCC");
            } else {
                pl("DDD");
            }
        } else if ((InputNumS > 50) && (InputNumS < 55)) {
            if (InputNumS % 2 == 0) {
                pl("CCC");
            } else {
                pl("DDD");
            }
        } else if ((InputNumS / 5) % 1 == 0) {
            pl("EEE");
        } else {
            pl("FFF");
        }
    }

    static int inNum() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    static int inputInt(String msg) {
        p(msg + ": ");
        int val = inNum();
        return val;
    }

    static void p(String Msg) {
        System.out.print(Msg);
    }

    static void pl(String Msg) {
        System.out.println(Msg);
    }
}
