package finalexam;

import java.util.Scanner;

public class FinalExam {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tangalin, Michael Jan R. | 1-BSIT-1");
        String names[] = {"AAA", "BBB", "CCC", "DDD", "EEE", "FFF", "GGG", "HHH", "III", "JJJ"};
        int age[] = {9, 10, 7, 5, 3, 1, 2, 4, 6, 8};
        String course[] = {"CS", "IT", "CS", "IT", "Law", "Med", "Engr", "Med", "Engr", "Law"};
        int yearlevel[] = {1, 2, 3, 4, 1, 2, 3, 4, 2, 4};

        System.out.println("NAME" + "\t" + "AGE" + "\t" + "COURSE" + "\t" + "YEAR LEVEL");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "\t" + age[i] + "\t" + course[i] + "\t" + yearlevel[i]);

        }
        System.out.println("-----END OF RECORD-----");
        System.out.print("Search: ");
        String searchVal = input.nextLine();

        System.out.print("Sort Type: (AGE / YEAR): ");
        String sortType = input.nextLine();

        System.out.print("Sort Order (Ascending / Descending): ");
        String sortOrder = input.nextLine();
        System.out.println("-----SORTED BY " + sortType + ", " + sortOrder + "-----");
        System.out.println("NAME" + "\t" + "AGE" + "\t" + "COURSE" + "\t" + "YEAR LEVEL");

        if (sortType.equals("AGE")) {
            if (sortOrder.equals("Ascending")) {
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
            } else if (sortOrder.equals("Descending")) {
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
        } else if (sortType.equals("YEAR")) {
            if (sortOrder.equals("Ascending")) {
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
            } else if (sortOrder.equals("Descending")) {
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
        for (int i = 0; i < names.length; i++) {
            String Records = names[i] + age[i] + course[i] + yearlevel[i];
            if (searchVal.equals("ALL") | Records.contains(searchVal)) {
                System.out.println(names[i] + "\t" + age[i]
                        + "\t" + course[i]
                        + "\t" + yearlevel[i]);
            }
        }
        System.out.println("-----END OF RECORD-----");
    }
}
