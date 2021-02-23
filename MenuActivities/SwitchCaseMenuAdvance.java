package activity2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String MenuChoice;
        String order;
        String variant ="";
        
        System.out.println("Mikey");
        Scanner sc = new Scanner(System.in);
        System.out.println("---MENU---");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Fries");

        System.out.print("Menu choice:");

        MenuChoice=sc.nextLine();


        switch(MenuChoice)
        {
            case "1":
                System.out.println("---VARIANTS---");
                System.out.println("1. Cheese");
                System.out.println("2. Pepperoni");
                System.out.println("3. Hawaiian");

                System.out.print("Variant choice:");
                order = sc.nextLine();
                switch(order)
                {
                    case "1":
                        order = "Cheese";
                        break;
                    case "2":
                        order = "Pepperoni";
                        break;
                    case "3":
                        order = "Hawaiian";
                        break;
                    default:
                        order ="Invalid";
                        variant = "Variant";
                }


                MenuChoice= order + " Pizza " + variant;
                break;
            case "2":
                System.out.println("---VARIANTS---");
                System.out.println("1. TLC");
                System.out.println("2. Double Patty");
                System.out.println("3. Cheese");

                System.out.print("Variant choice:");
                order = sc.nextLine();
                switch(order)
                {
                    case "1":
                        order = "TLC";
                        break;
                    case "2":
                        order = "Double Patty";
                        break;
                    case "3":
                        order = "Cheese";
                        break;
                    default:
                        order="Invalid";
                        variant = "Variant";
                }

                MenuChoice= order + " Burger " + variant;
                break;
            case "3":
                System.out.println("---VARIANTS---");
                System.out.println("1. BBQ");
                System.out.println("2. Cheese");
                System.out.println("3. Salt");

                System.out.print("Variant choice:");
                order = sc.nextLine();
                switch(order)
                {
                    case "1":
                        order = "BBQ";
                        break;
                    case "2":
                        order = "Cheese";
                        break;
                    case "3":
                        order = "Salt";
                        break;
                    default:
                        order="Invalid";
                        variant = "Variant";
                }

                MenuChoice= order + " Fries " + variant;
                break;
            default:
                MenuChoice="Invalid Menu Choices";
        }

        System.out.print(MenuChoice);

    }

}
