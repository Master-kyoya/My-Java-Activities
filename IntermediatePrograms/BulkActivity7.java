package bulk.activity.pkg7;

import java.util.Scanner;

public class BulkActivity7 {

    static String[][] InfoCount;
    static String[] ReCount;

    public static void main(String[] args) {
        pl("Michael Jan R. Tangalin | 1 - BSEMC - 1\n");
        InfoCount = new String[inputInt("Information Count")][inputInt("Record Count")];
        ReCount = new String[InfoCount.length];
        pl("----------");
        Get_Infos();
        pl("----------");
        DataRecords();
        pl("----------");
        Print_Infos(ReCount);
        Print_Recs(InfoCount);
    }

    static void Get_Infos() {
        for (int i = 0; i < ReCount.length; i++) {
            ReCount[i] = inputString("Information # " + i);
        }
    }

    static void DataRecords() {
        for (int i = 0; i < InfoCount[1].length; i++) {
            for (int x = 0; x < InfoCount.length; x++) {
                InfoCount[x][i] = inputString(ReCount[x] + "[" + i + "]");
            }
            pl("---");
        }
    }

    static void Print_Infos(String[] array) {
        for (int i = 0; i < array.length; i++) {
            p(array[i] + "\t");
        }
        System.out.println("");
    }

    static void Print_Recs(String[][] array) {
        for (int i = 0; i < array[1].length; i++) {
            for (int x = 0; x < array.length; x++) {
                p(array[x][i]+ "\t");
            }
            System.out.println("");
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
