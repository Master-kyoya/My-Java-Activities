package Car;
import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		
		
		Car kotse = new Car("TOYOTA", "Gray", 2014, 2500, "CAT", 45, 20.5);
		//Car(String name, String Color, int Model, int displacement, String type, double fuelCapacity, double fuelBurnRate)
		kotse.setType("SUV");
		Car auto = new Car("HONDA", "RED", 2009, 1300, "GOAT", 30, 10.5);
		//Car Auto = new Car(); 
		auto.setType("SEDAN");
		
		System.out.println("------------------------CAR BRANDS----------------------------");
		
		kotse.display();
		
		System.out.println("\nDetails:");
		System.out.println("Travel Distance for "+ kotse.make + " is " + 
		df.format(kotse.calculateDistance()));
		System.out.println("For " + kotse.make + " to travel for 5.25 hours, it takes " 
		+ df.format(kotse.fuelNeeded(5.25))+" Liter");
		
		System.out.println();
		
		auto.display();
		
		//kotse.calculateDistance();
		System.out.println("\nDetails:");
		System.out.println("Travel Distance for "+ auto.make + " is " + 
		df.format(auto.calculateDistance()));
		System.out.println("For " + auto.make + " to travel for 5.25 hours, it takes " 
		+ df.format(auto.fuelNeeded(5.25))+" Liter");
		
		System.out.println("--------------------------------END----------------------------");
	}
}
