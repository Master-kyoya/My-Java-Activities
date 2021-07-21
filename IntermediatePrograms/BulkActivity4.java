//ARRAY LIST
package bulk.activity.pkg4;
import java.util.Scanner;
public class BulkActivity4 {

    public static void main(String[] args) {
        pl("Michael Jan R. Tangalin | 1 - BSEMC - 1");
        pl("----input----");
        int max = inputInt("Enter max Record");
        Records(max);
    }
    static void Records(int maxRecord) {
        String[] Name = new String[maxRecord];
        String[] Gender = new String[maxRecord];
        String[] Month = new String[maxRecord];
        int[] Day = new int[maxRecord];
        int[] Year = new int[maxRecord];

        for (int i = 0; i < maxRecord; i++) {
            pl("---Rec [" + i + "]---");
            Name[i] = inputString("Enter Name");
            Gender[i] = inputString("Enter Gender");
            Month[i] = inputString("Enter Month of Birth");
            Day[i] = inputInt("Enter Day of Birth");
            Year[i] = inputInt("Enter Year of Birth");
        }
        pl("---Result---");
        pl("NAME\t" + "GENDER\t " + "BIRTH DATE\t" + "AGE\t");
        for (int i = 0; i < maxRecord; i++) {
            pl(Name[i] + "\t" + Gender[i] + "\t " + Month[i] + " " + Day[i] + ", " + Year[i] + "\t" + (2020 - Year[i])
                    +" years old");
        }
    }
    static int inNum() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    static String inSTR() {
        Scanner inputstr = new Scanner(System.in);
        return inputstr.nextLine();
    }

    static int inputInt(String msg) {
        p(msg + ": ");
        int val = inNum();
        return val;
    }

    static String inputString(String msg) {
        p(msg + ": ");
        String val = inSTR();
        return val;
    }

    static void p(String Msg) {
        System.out.print(Msg);
    }

    static void pl(String Msg) {
        System.out.println(Msg);
    }
}

