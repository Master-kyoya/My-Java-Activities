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
        MainMenu();
        int productID = inputnum("Food Choice # " );
        SwitchMenu(productID);
    }

    static void MainMenu() {
        PrintThisOneLine("---MENU---");
        for (int i = 0; i < FoodChoice.length; i++) {
            PrintThisOneLine((i + 1) + ". " + FoodChoice[i]);
        }
    }

    static void BurgerSubMenu() {
        for (int i = 0; i < BurgerVariation.length; i++) {
            PrintThisOneLine((i + 1) + ". " + BurgerVariation[i] + "..............." + "₱ " + BurgerPrice[i]);
        }
    }

    static void PastaSubMenu() {
        for (int i = 0; i < PastaVariation.length; i++) {
            PrintThisOneLine((i + 1) + ". " + PastaVariation[i] + "..............." + "₱ " + PastaPrice[i]);
        }
    }

    static void DrinksSubMenu() {
        for (int i = 0; i < DrinksVariation.length; i++) {
            PrintThisOneLine((i + 1) + ". " + DrinksVariation[i] + "..............." + "₱ " + DrinksPrice[i]);
        }
    }

    static void SwitchMenu(int FoodMenu) {
        switch (FoodMenu) {
            case 1:
                PrintThisOneLine("You Chosed: " + FoodChoice[1 - 1] + " Section");
                BurgerSubMenu();               
                int BurgerVariant = inputnum("Burger Variant ");
                switch (BurgerVariant) {
                    case 1:
                        PrintThisOneLine("You Chosed: " + BurgerVariation[1 - 1] + " Burger");
                        int CheeseBQty = inputnum("Quantity # ");
                        double TotalCheeseBVariant = MultiplyQTY(BurgerPrice[BurgerVariant - 1], CheeseBQty);
                        PrintThisOneLine("Total: " + "₱ " + TotalCheeseBVariant);
                        int CashForCheeseBVariant = inputnum("Enter Amount");
                        double CBChange = Subtraction(CashForCheeseBVariant, TotalCheeseBVariant);
                        PrintThisOneLine("Your Change: " + "₱ " + CBChange);
                        break;
                    case 2:
                        PrintThisOneLine("You Chosed: " + BurgerVariation[2 - 1] + " Burger");
                        int DPVariantQty = inputnum("Quantity # ");
                        double DoublePVariantTotal = MultiplyQTY(BurgerPrice[BurgerVariant - 1], DPVariantQty);
                        PrintThisOneLine("Total: " + "₱ " + DoublePVariantTotal);
                        int CashForDoublePVariant = inputnum("Enter Amount");
                        double DPChange = Subtraction(CashForDoublePVariant, DoublePVariantTotal);
                        PrintThisOneLine("Your Change: " + "₱ " + DPChange);
                        break;
                    case 3:
                        PrintThisOneLine("You Chosed: " + BurgerVariation[3 - 1] + " Burger");
                        int TLCVariantQty = inputnum("Quantity # ");
                        double TLCVariantTotal = MultiplyQTY(BurgerPrice[BurgerVariant - 1], TLCVariantQty);
                        PrintThisOneLine("Total: " + "₱ " + TLCVariantTotal);
                        int CashForTLCVariant = inputnum("Enter Amount");
                        double TLCChange = Subtraction(CashForTLCVariant, TLCVariantTotal);
                        PrintThisOneLine("Your Change: " + "₱ " + TLCChange);
                        break;
                }
                break;
            case 2:
                PrintThisOneLine("You Chosed: " + FoodChoice[2 - 1] + " Section");
                PastaSubMenu();
                int PastaVariant = inputnum("Pasta Variant ");
                switch (PastaVariant) {
                    case 1:
                        PrintThisOneLine("You Chosed: " + PastaVariation[1 - 1] + " Pasta");
                        int SpaghettiQty = inputnum("Quantity # ");
                        double TotalSpaghettiVariant = MultiplyQTY(PastaPrice[PastaVariant - 1], SpaghettiQty);
                        PrintThisOneLine("Total: " + "₱ " + TotalSpaghettiVariant);
                        int CashForSpaghettiVariant = inputnum("Enter Amount");
                        double SpaghettiChange = Subtraction(CashForSpaghettiVariant, TotalSpaghettiVariant);
                        PrintThisOneLine("Your Change: " + "₱ " + SpaghettiChange);
                        break;
                    case 2:
                        PrintThisOneLine("You Chosed: " + PastaVariation[2 - 1] + " Pasta");
                        int CarbonaraQty = inputnum("Quantity # ");
                        double TotalCarbonaraVariant = MultiplyQTY(PastaPrice[PastaVariant - 1], CarbonaraQty);
                        PrintThisOneLine("Total: " + "₱ " + TotalCarbonaraVariant);
                        int CashForCarbonaraVariant = inputnum("Enter Amount");
                        double CarbonaraChange = Subtraction(CashForCarbonaraVariant, TotalCarbonaraVariant);
                        PrintThisOneLine("Your Change: " + "₱ " + CarbonaraChange);
                        break;
                    case 3:
                        PrintThisOneLine("You Chosed: " + PastaVariation[3 - 1] + " Pasta");
                        int LasagnaQty = inputnum("Quantity # ");
                        double TotalLasagnaVariant = MultiplyQTY(PastaPrice[PastaVariant - 1], LasagnaQty);
                        PrintThisOneLine("Total: " + "₱ " + TotalLasagnaVariant);
                        int CashForLasagnaVariant = inputnum("Enter Amount");
                        double LasagnaChange = Subtraction(CashForLasagnaVariant, TotalLasagnaVariant);
                        PrintThisOneLine("Your Change: " + "₱ " + LasagnaChange);
                        break;
                }
                break;
            case 3:
                PrintThisOneLine("You Chosed: " + FoodChoice[3 - 1] + " Section");
                DrinksSubMenu();
                int DrinksVariant = inputnum("Drinks Variant ");
                switch (DrinksVariant) {
                    case 1:
                        PrintThisOneLine("You Chosed: " + DrinksVariation[1 - 1] + " Drinks");
                        int FantaQty = inputnum("Quantity # ");
                        double TotalFantaVariant = MultiplyQTY(DrinksPrice[DrinksVariant - 1], FantaQty);
                        PrintThisOneLine("Total: " + "₱ " + TotalFantaVariant);
                        int CashForFantaVariant = inputnum("Enter Amount");
                        double FantaChange = Subtraction(CashForFantaVariant, TotalFantaVariant);
                        PrintThisOneLine("Your Change: " + "₱ " + FantaChange);
                        break;
                    case 2:
                        PrintThisOneLine("You Chosed: " + DrinksVariation[2 - 1] + " Drinks");
                        int CokeQty = inputnum("Quantity # ");
                        double TotalCokeVariant = MultiplyQTY(DrinksPrice[DrinksVariant - 1], CokeQty);
                        PrintThisOneLine("Total: " + "₱ " + TotalCokeVariant);
                        int CashForCokeVariant = inputnum("Enter Amount");
                        double CokeChange = Subtraction(CashForCokeVariant, TotalCokeVariant);
                        PrintThisOneLine("Your Change: " + "₱ " + CokeChange);
                        break;
                    case 3:
                        PrintThisOneLine("You Chosed: " + DrinksVariation[3 - 1] + " Drinks");
                        int HeinekenQty = inputnum("Quantity # ");
                        double TotalHeinekenVariant = MultiplyQTY(DrinksPrice[DrinksVariant - 1], HeinekenQty);
                        PrintThisOneLine("Total: " + "₱ " + TotalHeinekenVariant);
                        int CashForHeinekenVariant = inputnum("Enter Amount");
                        double HeinekenChange = Subtraction(CashForHeinekenVariant, TotalHeinekenVariant);
                        PrintThisOneLine("Your Change: " + "₱ " + HeinekenChange);
                        break;
                }
                break;
            default:
                PrintThisOneLine("Invalid Choice");
                break;
        }
    }

    static int inNum() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    static int inputnum(String msg) {
        PrintThisOne(msg + ": ");
        int val = inNum();
        return val;
    }

    static double MultiplyQTY(int Price, int Quantity) {
        int total = Price * Quantity;
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
