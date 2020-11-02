//**************** Oct 30 -P2**************
package OOP_Inheritance;

public class BMW extends Car{
	//static methods can be overloaded but can't be overridden..
	@Override
	public String price() {
		System.out.println("BMW -- price");
		return "BMW price return";
	}
	
	
	public void autoParking() {
		System.out.println("BMW -- autoparking");
	}
	
	public static void wheels() {
		System.out.println("BMW -- wheels");
	}
}


