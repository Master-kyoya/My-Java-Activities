package bulk.activity.pkg6;
import java.util.Scanner;
public class BulkActivity6 {

    static String names[] = {"AAA", "BBB", "CCC", "DDD", "EEE", "FFF", "GGG", "HHH", "III", "JJJ"};
    static int age[] = {9, 10, 7, 5, 3, 1, 2, 4, 6, 8};
    static String course[] = {"CS", "IT", "CS", "IT", "Law", "Med", "Engr", "Med", "Engr", "Law"};
    static int yearlevel[] = {1, 2, 3, 4, 1, 2, 3, 4, 2, 4};

    public static void main(String[] args) {
        pl("Michael Jan R. Tangalin | 1 - BSEMC - 1");
        DisplayRecords();
        String searchVal = inputString("Search");
        String sortType = inputString("Sort Type: (AGE / YEAR)");
        String sortOrder = inputString("Sort Order (Ascending / Descending)");
        SearchOrganizedValue(searchVal, sortType, sortOrder);
    }
    static void DisplayRecords() {
        pl("NAME" + "\t" + "AGE" + "\t" + "COURSE" + "\t" + "YEAR LEVEL");
        for (int i = 0; i < names.length; i++) {
            pl(names[i] + "\t" + age[i] + "\t" + course[i] + "\t" + yearlevel[i]);
        }
        pl("-----END OF RECORD-----");
    }

    static void SearchOrganizedValue(String SearchVal, String SortType, String OrderType) {
         if (SortType.equals("AGE")) {
             if (OrderType.equals("Ascending")) {
                for (int x = 0; x < names.length; x++) {
                    for (int i = 0; i < names.length - 1; i++) {
                        if (age[i] > age[i + 1]) {
                            int tempAge = age[i];
                            age[i] = age[i + 1];
                            age[i + 1] = tempAge;

                            String tempName = names[i];
                            names[i] = names[i + 1];
                            names[i + 1] = tempName;

                            String tempCourse = course[i];
                            course[i] = course[i + 1];
                            course[i + 1] = tempCourse;

                            int tempYearLevel = yearlevel[i];
                            yearlevel[i] = yearlevel[i + 1];
                            yearlevel[i + 1] = tempYearLevel;
                        }
                    }
                }
            } else if (OrderType.equals("Descending")) {
                for (int x = 0; x < names.length; x++) {
                    for (int i = 0; i < names.length - 1; i++) {
                        if (age[i] < age[i + 1]) {
                            int tempAge = age[i];
                            age[i] = age[i + 1];
                            age[i + 1] = tempAge;

                            String tempName = names[i];
                            names[i] = names[i + 1];
                            names[i + 1] = tempName;

                            String tempCourse = course[i];
                            course[i] = course[i + 1];
                            course[i + 1] = tempCourse;

                            int tempYearLevel = yearlevel[i];
                            yearlevel[i] = yearlevel[i + 1];
                            yearlevel[i + 1] = tempYearLevel;
                        }
                    }
                }
            }
        } else if (SortType.equals("YEAR")) {
            if (OrderType.equals("Ascending")) {
                for (int x = 0; x < names.length; x++) {
                    for (int i = 0; i < names.length - 1; i++) {
                        if (yearlevel[i] > yearlevel[i + 1]) {
                            int tempYearLevel = yearlevel[i];
                            yearlevel[i] = yearlevel[i + 1];
                            yearlevel[i + 1] = tempYearLevel;

                            String tempName = names[i];
                            names[i] = names[i + 1];
                            names[i + 1] = tempName;

                            String tempCourse = course[i];
                            course[i] = course[i + 1];
                            course[i + 1] = tempCourse;

                            int tempAge = age[i];
                            age[i] = age[i + 1];
                            age[i + 1] = tempAge;
                        }
                    }
                }
            } else if (OrderType.equals("Descending")) {
                for (int x = 0; x < names.length; x++) {
                    for (int i = 0; i < names.length - 1; i++) {
                        if (yearlevel[i] < yearlevel[i + 1]) {
                            int tempYearLevel = yearlevel[i];
                            yearlevel[i] = yearlevel[i + 1];
                            yearlevel[i + 1] = tempYearLevel;

                            String tempName = names[i];
                            names[i] = names[i + 1];
                            names[i + 1] = tempName;

                            String tempCourse = course[i];
                            course[i] = course[i + 1];
                            course[i + 1] = tempCourse;

                            int tempAge = age[i];
                            age[i] = age[i + 1];
                            age[i + 1] = tempAge;
                        }
                    }
                }
            }
         }
         PrintVal(SearchVal, SortType, OrderType);
    }
    static void PrintVal(String SearchVal, String SortType, String OrderType){
         pl("-----SORTED BY " + SortType + ", " + OrderType + "-----");
        pl("NAME" + "\t" + "AGE" + "\t" + "COURSE" + "\t" + "YEAR LEVEL");

        for (int i = 0; i < names.length; i++) {
            String Records = names[i] + age[i] + course[i] + yearlevel[i];
            if (SearchVal.equals("ALL") | Records.contains(SearchVal)) {
                pl(names[i] + "\t" + age[i]
                        + "\t" + course[i]
                        + "\t" + yearlevel[i]);
            }
        }
        pl("-----END OF RECORD-----");
    }
    static String inSTR() {
        Scanner inputstr = new Scanner(System.in);
        return inputstr.nextLine();
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

