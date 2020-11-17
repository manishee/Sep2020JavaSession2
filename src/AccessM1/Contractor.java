//** Nov 16-P3***
package AccessM1;
//same package non-sub class
public class Contractor {

	public static void main(String[] args) {

		Contractor c=new Contractor();
//		System.out.println(c.name);
//		System.out.println(c.age);
//		System.out.println(c.salary);
//		System.out.println(c.c);
		
		//there is no relationship between Emp and Contractor classes
		
		Emp e=new Emp();
		System.out.println(e.name);
		//System.out.println(e.age); ->private
		System.out.println(e.salary);
		System.out.println(e.c);
		
		
	}

}
