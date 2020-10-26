//*************** Oct 21 -p1*******************
package JavaSessions;

public class MethodOverloading {

	// What is method Overloading?
	// Within the same class, when we have different methods with
	//1. same name
	//2. having different parameters
	//3. the sequence of the parameters is different
	//4. test() is called overloaded method
	//5. Method overloading is an example compile time polymorphism
	//6. The compiler decides at the compile time based on the parameters
	//which method to call
	
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.test();
		obj.test(10);
		obj.test(10, "Selenium");
	}
	
	public void test() {//no parameters
		System.out.println("No paramter test method");
	}
	
	public void test(int i) {// int i
		System.out.println(i);
		
	}
	
	public void test(int i, String p) {
		System.out.println(i+" "+p);
	}

	public void test(String p, int i) {
		
	}
}
