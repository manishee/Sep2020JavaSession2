//************** Oct 19 *****************
package SeleniumSessions;

public class CarDesign {

	//class variables
	//static members = static variables+ static methods
	String name;
	int price;
	String model;
	static int wheels=4;
	//whenever we have a common property value.
	public void start() {
		System.out.println("car start");
	}
	
	public void stop() {
		System.out.println("car stop");
	}
	
	public static void run() {
		System.out.println("car run");
	}
		
	public static void main(String[] args) {
		 
		CarDesign c1=new CarDesign();
		c1.name="BMW";
		c1.model="720d";
		c1.price=70;
		
		// static members can be accessed in 2 ways
		
		//1. Directly
		//wheels=4;
		System.out.println(wheels);
		run();
		
		//2. Using the classname
		//CarDesign.wheels=5;
		System.out.println(wheels);
		CarDesign.run();
		
		System.out.println(c1.name + " " + c1.model +" "+ c1.price + " " +CarDesign.wheels);
		
		//c1.wheels=5;
		//c1.run();
	}

}
