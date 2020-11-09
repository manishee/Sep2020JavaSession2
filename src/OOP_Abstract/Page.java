//**************** Nov 4- P1 ***********
package OOP_Abstract;

public abstract class Page {
	
	//can I create the constructor of an abstract class
	
	public Page() {
		System.out.println("Page class constructor");
	}
	
	
	// we cant create the object of an abstract class
	// abstract class may have some abstract methods
	// abstract class may have non abstract methods
	
	public abstract void title(); //abstract method
	public abstract void url();
	
	//non abstract method
	public void timeOut() {
		System.out.println("page -- timeout");
	}
	//static
	public static void logo() {
		System.out.println("Page -- logo");
	}
}
