package bulk.activity.pkg2;

import java.util.Scanner;

public class BulkActivity2 {

    public static void main(String[] args) {
        pl("TANGALIN, MICHAEL JAN R. | 1 - BSEMC - 1");
        InputNum();
    }

    static void InputNum() {
        int StartNum = inputInt("Enter Starting Number");
        int IncreNum = inputInt("Enter Increment Number");
        int LoopNum = inputInt("Enter Loop Times");
        InitializeNum(StartNum, IncreNum, LoopNum);
    }

    static void InitializeNum(int Start_Num, int Incre_Num, int Loop_Num) {
        int x = 1, y = 1;
        pl("---Result---");

        while (x != Loop_Num + 1) {
            pl("Loop " + y + ": " + Start_Num);
            Start_Num+=Incre_Num;
            y++;
            x++;
        }
        pl("---END---");
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
