package activity.pkg5.atm;

import java.util.Scanner;

public class ATM {

    static int[] IDNum = {2130, 1450, 1356};
    static int[] pin = {174, 130, 146};
    static double[] AccSavings = {5000, 6000, 2000};

    static void LoginAcc() {
        pl("=============T. BANK==============");
        pl("-------Welcome to T. BANK--------"
                + "\n\t(Find your Ways)");
        pl("=================================");
        boolean loopagain = true;
        pl("---Login---");
        int idnum;
        int pinNum;
        do {
            idnum = inputInt("Enter ID Number");
            pinNum = inputInt("Enter PIN Number");
            pl("");
            for (int i = 0; i < IDNum.length; i++) {
                if (idnum == IDNum[i] & pinNum == pin[i]) {
                    idnum = i;
                    pl("===LOGIN SUCCESS===");
                    MainMenu(idnum);
                    loopagain = false;
                }
            }
            pl("===LOGIN FAILED, TRY AGAIN===");
        } while (loopagain);
    }

    static void MainMenu(int idnum) {

        while (true) {

            pl("---Main Menu---");
            pl("[1] Check Balance");
            pl("[2] Deposit");
            pl("[3] Withdraw");
            pl("[4] Exit");
            int choiceMenu = inputInt("Menu Choice");
            switch (choiceMenu) {
                case 1:
                    pl("-------Check Balance-------");
                    CheckBalance(idnum);
                    break;
                case 2:
                    pl("------------Deposit-----------");

                    Deposit(idnum);
                    break;
                case 3:
                    pl("-----------Withdraw----------");
                    Withdraw(idnum);
                    break;
                case 4:
                    pl("Program Exit");
                    System.exit(0);
                    break;
                default: 
                    pl("Invalid Number Try Again");
                    break;
            }
        }
    }

    static void CheckBalance(int idnum) {
        pl("Current Balance: ₱ " + AccSavings[idnum]);
        MainMenu(idnum);
    }

    static void Deposit(int idnum) {
        double DepoAmount = inputDouble("Enter Amount");
        AccSavings[idnum] = AccSavings[idnum] + DepoAmount;
        MainMenu(idnum);
    }

    static void Withdraw(int idnum) {
        double WithAmount = inputDouble("Enter Withdraw amount");
        AccSavings[idnum] = AccSavings[idnum] - WithAmount;
        MainMenu(idnum);
    }

    static int inNum() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    static double inDouble() {
        Scanner inputDouble = new Scanner(System.in);
        return inputDouble.nextDouble();
    }

    static int inputInt(String msg) {
        p(msg + ": ");
        int val = inNum();
        return val;
    }

    static double inputDouble(String msg) {
        p(msg + ": ");
        double val = inDouble();
        return val;
    }

    static void p(String msg) {
        System.out.print(msg);
    }

    static void pl(String msg) {
        System.out.println(msg);
    }
}
