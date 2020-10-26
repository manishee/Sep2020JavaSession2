//****************** Oct 23 - P2 ****************
package ConstructorConcept;

public class Person {
	//class varaibles
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	public Person() {
		System.out.println("Hello Person");
	}
	
	public Person(String name) {
		System.out.println();
	}
	
	public Person(String name, int age) {
		this.name=name;//global variable = local variable
		this.age=age;	
	}
	
	
	public Person(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	public Person(String name, int age, double salary, boolean isPermanent) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isPermanent = isPermanent;
	}
	
	
	public Person(String name, int age, double salary, boolean isPermanent, char gender) {
	
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isPermanent = isPermanent;
		this.gender = gender;
	}

	public static void main(String[] args) {
		
//		Person p1=new Person();
//		System.out.println(p1.name);
//		System.out.println(p1.gender);
		
		Person p2=new Person("Nikita", 25);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		Person p3=new Person("Supriya", 24, 34.01);
		System.out.println(p3.name + " " + p3.age +" " +p3.salary);
	
		Person p4=new Person("Anu", 22, 22.01, false, 'f');
		System.out.println(p4.name + " " + p4.age +" " +p4.salary +" "+ p4.isPermanent+" "+p4.gender);
		
	}
	
}
