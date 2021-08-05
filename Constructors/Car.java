package Car;

public class Car {
	String make;
	String color;
	int model;
	int displacement;
	private String type;
	double fuelCapacity;
	double fuelBurnRate;

	// Constructor
	Car(String name, String color, int model, int displacement, 
			String type, double fuelCapacity, double fuelBurnRate) {
		make = name;
		this.color = color;
		this.model = model;
		this.displacement = displacement;
		this.type = type;
		//this.type=type;
		setType(type);
		this.fuelCapacity = fuelCapacity;
		this.fuelBurnRate = fuelBurnRate;
	}
	void display() {
		System.out.println("BRAND: " + this.make);
		System.out.println("Color: " + this.color);
		System.out.println("Model: " + this.model);
		System.out.println("Displacement: " + this.displacement);
		System.out.println("Car Type: " + getType());
		System.out.println("Fuel Capacity: " + this.fuelCapacity);
		System.out.println("Fuel Burnrate: " + this.fuelBurnRate);
		
		//kotse.calculateDistance();
	}
	
	//GETTERS
	String getType()
	{
		return type;
	}
	
	//SETTERS
	//Regulations
	void setType(String type)
	{
		if(type=="SUV"||type=="SEDAN"||type=="PICKUP") 
		{
			this.type=type;
		}
		else
		{
			this.type="Unknown Type of Car!";
		}
		
	}

	double calculateDistance() {
		double distance;
		distance = fuelCapacity * fuelBurnRate;
		return distance;
	}

	double fuelNeeded(double time) {
		return time * fuelBurnRate;
	}

}
