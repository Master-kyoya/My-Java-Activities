package activity3;
import java.util.Scanner;
public class Activity3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Michael Jan R. Tangalin");
		System.out.println("1-BSIT-1");
		System.out.println("---MENU---");
		System.out.println("1. Pizza");
		System.out.println("2. Burger");
		System.out.println("3. Fries");
		
		System.out.print("Menu choice: ");
		String Menu = input.nextLine();
		switch(Menu){
		case "1":
			System.out.println("---Variants---");
			System.out.println("1. Cheese");
			System.out.println("2. Pepperoni");
			System.out.println("3. Hawaiian");
			
			System.out.print("Variant Choice: "); 
			int pizza = input.nextInt();
			switch(pizza) {
			case 1: 
				System.out.println("Cheese Pizza");
				break;
			case 2:
				System.out.println("Pepperoni Pizza");
				break;
			case 3:
				System.out.println("Hawaiian Pizza");
				break;
			default:
				System.out.println("Invalid Pizza Variant");
			}
			break;
		case "2":
			System.out.println("---Variants---");
			System.out.println("1. TLC");
			System.out.println("2. Double Patty");
			System.out.println("3. Cheese ");		
			
			System.out.print("Variant Choice: "); 
			int burger = input.nextInt();
			switch(burger) {
			case 1: 
				System.out.println("TLC Burger");
				break;
			case 2:
				System.out.println("Double Patty Burger");
				break;
			case 3:
				System.out.println("Cheese Burger");
				break;
			default:
				System.out.println("Invalid Burger Variant");
			}
			break;
		case "3":
			System.out.println("---Variants---");
			System.out.println("1. BBQ");
			System.out.println("2. Cheese");
			System.out.println("3. Salt");
			
			System.out.print("Variant Choice: "); 
			int fries = input.nextInt();
			switch(fries) {
			case 1: 
				System.out.println("BBQ Fries");
				break;
			case 2:
				System.out.println("Cheese Fries");
				break;
			case 3:
				System.out.println("Salt Fries");
				break;
			default:
				System.out.println("Invalid Fries Variant");
			}
			break;
		default:
				System.out.println("Invalid Choice Menu");
		}
	}
}
