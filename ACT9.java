package activity.pkg9.array.search;

import java.util.Scanner;

public class Activity9ArraySearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tangalin, Michael Jan, R./1-BSIT-1");
        Boolean loopagain = true;

        String name[] = {"Ace", "Ben", "Cas", "Dan", "Eve", "Fei", "Gie", "Han", "Ivy", "Joe"};
        int age[] = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        String gender[] = {"Male", "Male", "Female", "Male", "Female", "Female", "Female", "Male", "Female", "Male"};
        String course[] = {"BSIT", "BSCS", "BSIS", "BSIT", "BSCS", "BSIS", "BSCS", "BSIS", "BSCS", "BSIT"};
        String yearlvl[] = {"1st year", "4th year", "3rd year", "1st year", "2nd year",
            "3rd year", "2nd year", "4th year", "4th year", "1st year"};
        int cel[] = {63911, 63922, 63933, 63944, 63955, 63966, 63977, 63988, 63999, 63900};
        String address[] = {"Manila", "Quezon City", "Bulacan", "Valenzuela", "Pampanga",
            "Valenzuela", "Manila", "Pampanga", "Bulacan", "Quezon City"};

        System.out.println("NAME" + "\t" + "AGE" + "\t" + "GENDER" + "\t" + "COURSE" + "\t"
                + "Year Level" + "\t" + "Cel" + "\t" + "Address");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + "\t" + age[i] + "\t" + gender[i] + "\t" + course[i] + "\t"
                    + yearlvl[i] + "\t" + cel[i] + "\t" + address[i]);
        }

        String searchVal;
        do {
            System.out.print("Search: ");
            searchVal = input.nextLine();

            for (int i = 0; i < name.length; i++) {

                String Allrecords = name[i] + age[i] + gender[i] + course[i] + yearlvl[i] + cel[i] + address[i];
                if (Allrecords.contains(searchVal)) {
                    System.out.println(name[i] + "\t" + age[i] + "\t" + gender[i] + "\t" + course[i] + "\t" + yearlvl[i]
                            + "\t" + cel[i] + "\t" + address[i]);
                }

            }
        } while (!searchVal.equals("EXIT"));

        System.out.println("Program EXIT");

    }
}
