package activity2;
import java.util.Scanner;
public class Activity2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Menu;
		String order;
		String variant = " ";
		
		System.out.println("---MENU---");
		System.out.println("1. Pizza");
		System.out.println("2. Burger");
		System.out.println("3. Fries");
		System.out.println("4. Pasta");

		System.out.print("Menu choice: ");
		Menu = input.nextLine();
		
		if(Menu.equals("1")) {
			System.out.println("---Variants---");
			System.out.println("1. Cheese");
			System.out.println("2. Pepperoni");
			System.out.println("3. Hawaiian");
			
			System.out.print("Variant choice: ");
			order = input.nextLine();
			
			if(order.equals("1")) {
				order = "Cheese";
			}
			else if (order.equals("2")) {
				order = "Pepperoni";
			}
			else if(order.equals("3")) {
				order="Hawaiian";
			}
			else {
				order = "Invalid";
				variant = "Variant";
			}
			System.out.println(Menu = order + " Pizza " + variant);
		}
		else if (Menu.equals("2")) {
			System.out.println("---Variants---");
			System.out.println("1. TLC");
			System.out.println("2. Double Patty");
			System.out.println("3. Cheese");
			
			System.out.print("Variant choice: ");
			order = input.nextLine();
			
			if(order.equals("1")) {
				order = "TLC";
			}
			else if (order.equals("2")) {
				order = "Double Patty";
			}
			else if (order.equals("3")) {
				order = "Cheese";
			}
			else {
				order = "Invalid";
				variant = "Variant";
			}
			System.out.println(Menu = order + " Burger " + variant);
		}
		else if (Menu.equals("3")) {
			System.out.println("---Variants---");
			System.out.println("1. BBQ");
			System.out.println("2. Cheese");
			System.out.println("3. Salt");

			System.out.print("Variant choice: ");
			order = input.nextLine();
			
			if(order.equals("1")) {
				order = "BBQ";
			}
			else if (order.equals("2")) {
				order = "Cheese";
			}
			else if(order.equals("3")) {
				order = "Salt";
			}
			else {
				order = "Invalid";
				variant = "Variant";
			}
			System.out.println(Menu = order + " Fries " + variant);
		}
		else if(Menu.equals("4")) {
			System.out.println("---Variants---");
			System.out.println("1. Carbonara");
			System.out.println("2. Spaghetti");
			System.out.println("3. Bake Mac");

			System.out.print("Variant choice: ");
			order = input.nextLine();
			
			if(order.equals("1")) {
				order = "Carbonara";
			}
			else if(order.equals("2")) {
				order = "Spaghetti";
			}
			else if(order.equals("3")) {
				order = "Bake Mac";
			}
			else {
				order = "Invalid";
				variant = "Variant";
			}
			System.out.println(Menu = order + " Pasta "+ variant);
		}
		else {
			System.out.println(Menu = "Invalid Menu Choice");
		}
	}
}
