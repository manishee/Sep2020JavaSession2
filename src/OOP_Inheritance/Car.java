//*************** Oct 30 - P1 ************
package OOP_Inheritance;

public class Car extends Vehicle {

	
	public String price() {
		System.out.println("Car -- price");
		return "Car price is 100K";
	}
	
	public void start() {
		System.out.println("Car -- start");
	}
	
	public void stop() {
		System.out.println("Car -- stop");
	}
	
	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
	public static void wheels() {
		System.out.println("Car -- wheels");
	}
	
	
}

//final
//1. value of a variable declared as final cant be modified
//2. method declared as final cant be overridden
//3. class declared as final cant be inherited
