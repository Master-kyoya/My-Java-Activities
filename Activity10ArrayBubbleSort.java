package activity10.array.bubble.sort;

public class Activity10ArrayBubbleSort {

    public static void main(String[] args) {
        System.out.println("TANGALIN, MICHAEL JAN, R. | 1-BSIT-1");
        System.out.println("-Default Record-");
        String name[] = {"Ace", "Ben", "Cas", "Dan", "Eve"};
        int age[] = {19, 21, 18, 22, 20};
        String gender[] = {"Male", "Male", "Female", "Male", "Female"};
        int yearlvl[] = {3, 1, 5, 2, 4};

        for (int i = 0; i < name.length; i++) {
            System.out.println("Name:" + name[i] + "\t" + "Age:" + age[i] + "\t" + "Gender:" + gender[i] + "\t"
                    + "Year Level:" + yearlvl[i]);
        }
        System.out.println("-Sorted Age: Ascending-");
        for (int x = 0; x < name.length; x++) {

            for (int i = 0; i < name.length - 1; i++) {
                if (age[i] > age[i + 1]) {
                    int tempAge = age[i];
                    age[i] = age[i + 1];
                    age[i + 1] = tempAge;

                    String tempName = name[i];
                    name[i] = name[i + 1];
                    name[i + 1] = tempName;

                    int tempYearLevel = yearlvl[i];
                    yearlvl[i] = yearlvl[i + 1];
                    yearlvl[i + 1] = tempYearLevel;

                    String tempGender = gender[i];
                    gender[i] = gender[i + 1];
                    gender[i + 1] = tempGender;
                }
            }
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println("Name:" + name[i] + "\t" + "Age:" + age[i] + "\t" + "Gender:" + gender[i] + "\t"
                    + "Year Level:" + yearlvl[i]);
        }
        System.out.println("-Sorted Age: Descending-");
        for (int x = 0; x < name.length; x++) {

            for (int i = 0; i < name.length - 1; i++) {
                if (age[i] < age[i + 1]) {
                    int tempAge = age[i];
                    age[i] = age[i + 1];
                    age[i + 1] = tempAge;

                    String tempName = name[i];
                    name[i] = name[i + 1];
                    name[i + 1] = tempName;

                    int tempYearLevel = yearlvl[i];
                    yearlvl[i] = yearlvl[i + 1];
                    yearlvl[i + 1] = tempYearLevel;

                    String tempGender = gender[i];
                    gender[i] = gender[i + 1];
                    gender[i + 1] = tempGender;
                }
            }
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println("Name:" + name[i] + "\t" + "Age:" + age[i] + "\t" + "Gender:" + gender[i] + "\t"
                    + "Year Level:" + yearlvl[i]);
        }
        System.out.println("-Sorted Year Level: Ascending-");
        for (int x = 0; x < name.length; x++) {

            for (int i = 0; i < name.length - 1; i++) {
                if (yearlvl[i] > yearlvl[i + 1]) {
                    int tempAge = age[i];
                    age[i] = age[i + 1];
                    age[i + 1] = tempAge;

                    String tempName = name[i];
                    name[i] = name[i + 1];
                    name[i + 1] = tempName;

                    int tempYearLevel = yearlvl[i];
                    yearlvl[i] = yearlvl[i + 1];
                    yearlvl[i + 1] = tempYearLevel;

                    String tempGender = gender[i];
                    gender[i] = gender[i + 1];
                    gender[i + 1] = tempGender;
                }
            }
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println("Name:" + name[i] + "\t" + "Age:" + age[i] + "\t" + "Gender:" + gender[i] + "\t"
                    + "Year Level:" + yearlvl[i]);
        }
        System.out.println("-Sorted Year Level: Descending-");
        for (int x = 0; x < name.length; x++) {
            for (int i = 0; i < name.length - 1; i++) {
                if (yearlvl[i] < yearlvl[i + 1]) {
                    int tempAge = age[i];
                    age[i] = age[i + 1];
                    age[i + 1] = tempAge;

                    String tempName = name[i];
                    name[i] = name[i + 1];
                    name[i + 1] = tempName;

                    int tempYearLevel = yearlvl[i];
                    yearlvl[i] = yearlvl[i + 1];
                    yearlvl[i + 1] = tempYearLevel;

                    String tempGender = gender[i];
                    gender[i] = gender[i + 1];
                    gender[i + 1] = tempGender;
                }
            }
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println("Name:" + name[i] + "\t" + "Age:" + age[i] + "\t" + "Gender:" + gender[i] + "\t"
                    + "Year Level:" + yearlvl[i]);
        }
    }
}
