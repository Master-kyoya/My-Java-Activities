package MathVariables;

public class math {

	public static void main(String[] args) {
		System.out.println("Sample Java Math Programs\n");
		String Name = "Mikey";
		double x = 3;
		double y = 8;
		
		System.out.println("abs: "+ Math.abs(x));
		System.out.println("max: " + Math.max(x, y));
		System.out.println("min: " + Math.min(x, y));
		System.out.println("pow: "+ Math.pow(x, y));
		System.out.println("round: "+Math.round(x));
		System.out.println("sqrt: " + Math.sqrt(x));
		System.out.println("toLowerCase: " + Name.toLowerCase());
		System.out.println("toUpperCase: " + Name.toUpperCase());
		System.out.println("isDigit: " + Character.isDigit('m'));
		System.out.println("isLetter: " + Character.isLetter('K'));
	}
}
