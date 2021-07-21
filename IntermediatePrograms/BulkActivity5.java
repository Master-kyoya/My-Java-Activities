package bulk.activity.pkg5;
import java.util.Scanner;
public class BulkActivity5 {

    static String names[] = {"Alucard", "Layla", "Chou", "Miya", "Clint", "Eudora", "Franco", "Hilda", "Gord", "Kimmy"};
    static String BirthMonth[] = {"Jan ", "Feb", "Mar", "Apr", "May", "Jan", "Nov", "Mar", "Dec", "May"};
    static int BirthDay[] = {5, 10, 15, 20, 25, 30, 11, 25, 12, 23};
    static int BirthYear[] = {2000, 2001, 2002, 2010, 2012, 2013, 2003, 2011, 2010, 2000};
    static int age[] = {20, 19, 18, 10, 8, 7, 17, 9, 10, 20};
    static String Gender[] = {"Male", "Female", "Male", "Female", "Male",
        "Female", "Male", "Female", "Male", "Female"};
    static String Country[] = {"Philippines", "Japan", "Europe", "Germany", "China", "France", "India",
        "Philippines", "Japan", "South Korea"};

    public static void main(String[] args) {
        pl("Michael Jan R. Tangalin | 1 - BSEMC - 1");
        boolean loopagain = true;
        DataBaseRecords();
        int attempts = 0;
        while (loopagain) {
            SearchParameters();
            attempts++;
            if (attempts == 3) {
                loopagain = false;
            }
        }
    }
    static void DataBaseRecords() {
        pl("----------START DB----------");
        pl("NAME" + "\t" + "BIRTH DATE" + "\t" + "AGE" + "\t" + "GENDER" + "\t" + "ADDRESS");
        for (int i = 0; i < names.length; i++) {
            pl(names[i] + "\t" + (BirthMonth[i] + " " + BirthDay[i] + ", " + BirthYear[i]) + "\t" + age[i] + "\t"
                    + Gender[i] + "\t" + Country[i]);
        }
        pl("----------END DB----------");
    }

    static void SearchParameters() {

        String Search1 = inputSTR("Search Parameter 1");
        String Search2 = inputSTR("Search Parameter 2");
        String Search3 = inputSTR("Search Parameter 3");

        pl("---Search Result---");
        pl("NAME" + "\t" + "BIRTH DATE" + "\t" + "AGE" + "\t" + "GENDER" + "\t" + "ADDRESS");
        for (int i = 0; i < names.length; i++) {
            String Allrecords = names[i] + "\t" + (BirthMonth[i] + " " + BirthDay[i] + ", " + BirthYear[i]) + "\t" + age[i]
                    + "\t" + Gender[i] + "\t" + Country[i];
            if (Allrecords.contains(Search1)) {
                if (Allrecords.contains(Search2)) {
                    if (Allrecords.contains(Search3)) {
                        pl(names[i] + "\t" + (BirthMonth[i] + " " + BirthDay[i] + ", " + BirthYear[i]) + "\t" + age[i] + "\t"
                                + Gender[i] + "\t" + Country[i]);
                    }
                }
            }
        }
        pl("---End Result---");
    }
    static String inSTR() {
        Scanner inputstr = new Scanner(System.in);
        return inputstr.nextLine();
    }

    static String inputSTR(String msg) {
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
