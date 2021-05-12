package activity.pkg3.pos;
import java.util.Scanner;
public class Activity3POS {

    static String FoodChoice[] = {"Burger", "Pasta", "Drinks"};

    static String BurgerVariation[] = {"Cheese", "Double Patty", "TLC"};
    static String PastaVariation[] = {"Spaghetti", "Carbonara", "Lasagna"};
    static String DrinksVariation[] = {"Fanta", "Coke", "Heineken"};

    static int BurgerPrice[] = {29, 59, 79};
    static int PastaPrice[] = {50, 60, 70};
    static int DrinksPrice[] = {10, 12, 15};

    public static void main(String[] args) {
        PrintThisOneLine("Tangalin, Michael Jan R. | 1-BSEMC-1");
        PrintThisOneLine("*************************************");
        PrintThisOneLine("PattyHub, Inc. \n" + "May I take your Order?");
        PrintThisOneLine("*************************************");
        MainMenu();
        int pID = inputs("Food Choice");
        int choices = InputMenuVariation(pID);
        int QTY = inputs("Quantity#");
        double estimatedTotal = MultiplyQTY(choices - 1, QTY, pID);
        PrintThisOneLine("Total: " + "₱ " + estimatedTotal);
        int amountMoney = inputs("Enter Amount");
        double change = Subtraction(amountMoney, estimatedTotal);
        PrintThisOneLine("Your change: ₱ " + change);
    }

    static void MainMenu() {
        PrintThisOneLine("---MENU---");
        for (int i = 0; i < FoodChoice.length; i++) {
            PrintThisOneLine((i + 1) + ". " + FoodChoice[i]);
        }
    }

    static int InputMenuVariation(int productID) {

        switch (productID) {
            case 1:
                PrintThisOneLine("---" + FoodChoice[1 - 1] + " Section" + "---");
                for (int i = 0; i < BurgerVariation.length; i++) {
                    PrintThisOneLine((i + 1) + ". " + BurgerVariation[i] + "..............." + BurgerPrice[i]);
                }
                break;
            case 2:
                PrintThisOneLine("---" + FoodChoice[2 - 1] + " Section" + "---");
                for (int i = 0; i < PastaVariation.length; i++) {
                    PrintThisOneLine((i + 1) + ". " + PastaVariation[i] + "..............." + PastaPrice[i]);
                }
                break;
            case 3:
                PrintThisOneLine("---" + FoodChoice[3 - 1] + " Section" + "---");
                for (int i = 0; i < DrinksVariation.length; i++) {
                    PrintThisOneLine((i + 1) + ". " + DrinksVariation[i] + "..............." + DrinksPrice[i]);
                }
                break;
        }
        PrintThisOne(FoodChoice[productID - 1] + " Variant: ");
        int variantCode = inNum();
        return variantCode;
    }

    static int inNum() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    static int inputs(String msg) {
        PrintThisOne(msg + ": ");
        int val = inNum();
        return val;
    }

    static int MultiplyQTY(int Variation, int Quantity, int Product) {
        int total = 0;
        switch (Product) {
            case 1:
                total = BurgerPrice[Variation] * Quantity;
                break;
            case 2:
                total = PastaPrice[Variation] * Quantity;
                break;
            case 3:
                total = DrinksPrice[Variation] * Quantity;
                break;
        }
        return total;
    }

    static double Subtraction(double Cash, double Total) {

        double change = Cash - Total;
        return change;
    }

    static void PrintThisOne(String Message) {
        System.out.print(Message);
    }

    static void PrintThisOneLine(String Message) {
        System.out.println(Message);
    }
}
