//********************* Oct 23 -P1 *****************
package ConstructorConcept;

public class Employee {
String name;
int age;
double salary;
boolean isPermanent;
char gender;

//constructor of a class
//looks like a function, but it is not a function
//constructor name will be same as class name
//a function can or can't return a value, but a constructor never returns a value
//no return or void keywords in constructors
//constructors can be overloaded .. duplicate constructors are not allowed
//constructor will be called when we create an object of a class	

	public Employee() {// default const or 0 parameter constructor
	System.out.println("default emp const....");
	System.out.println("Hello Employee");
}

	public Employee(int i) {
		System.out.println("1 param constructor " + i);
	}
	
	public Employee(int i, String p) {
		System.out.println("2 param const... "+i + " " +p) ;
	}
	public static void main(String args[]) {
		System.out.println("hello");
		Employee e1=new Employee();
		Employee e2=new Employee(10);
		Employee e3=new Employee(20,"Selenium");
	}
// Actual usage of constructors is to initialize the class variables

}