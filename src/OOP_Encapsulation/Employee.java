//*************** Oct 26 - P1******************
package OOP_Encapsulation;

public class Employee {

	//class variables
	//data hiding
	//deliberately declaring the variables as private
	//secure our data members
	//hide the implementation
	//data hiding is part of Encapsulation
	//we can achieve data hiding through Encapsulation
	
	//data members - (non static)class variables + class methods
	private String name;
	private int id;
	private int age;
	private double salary;

	//getter and setter methods: (public methods)
	//setter method will use this keyword
	//getter method will always return..
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.name="Tom";
		System.out.println(e1.name);
		
	}

}
