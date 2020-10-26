//************ Oct 7 *************
package JavaSessions;

public class Car { // template
	
	//global variables or class variables
	String name;
	String color;
	int price;
	String model;

	public static void main(String[] args) {
		
		//create an object of class : using new keyword
		Car c1=new Car(); // new Car() -> object, c1 is the name /reference
		//Car is the class
		c1.color="Blue";
		c1.name="BMW";
		c1.price=40000;
		c1.model="520d";
		
		Car c2=new Car();
		c2.color="White";
		c2.name="Audi";
		c2.price=30000;
		c2.model="Q5";
		
		System.out.println(c1.name +" "+c1.color +" " +c1.price +" "+c1.model);
		System.out.println(c2.name +" "+c2.color +" " +c2.price +" "+c2.model);
		// no reference object
		//new Car().name="Honda";
		//new Car().model="Civic";
		
		//Null reference object
		Car c3=new Car();
		c3=null;
		
		System.gc();
	}

}
