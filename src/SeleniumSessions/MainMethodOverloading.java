//*************** Oct 21 -p3*******************
package SeleniumSessions;

public class MainMethodOverloading {

	//main method doesn't return anything
	//main method can be overloaded
	public static void main(String[] a) {
		main(10);
	}
	
	public static void main(int i) {
		System.out.println(i);
	}
	
	public static void main(int i, String p) {
		
	}
	
	public static void main(int i, int j) {
		
	}

}
