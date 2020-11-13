//***************** Nov 2- P1 ********************
package OOP_Interface;

public interface USMedical extends WHO{
	
	int admission_fee=50;
	
	// No method body
	// Only method declaration -- method prototype
	// Can't create object of an interface
	// Interface variables are always static and final by default
	
	public void orthoServices(); // abstract methods
	
	public void physioServices();
	
	public void emergencyServices();
	
	public void audiologyServices();
	
	//Can we create a static method inside an interface
	public static void minFee() {
		System.out.println("USMedical -- Min fee is USD 10");
	}
	
}
