//********************* Oct 19 ******************
package SeleniumSessions;

public class EmpTest {
	
	String name;
	int age;
	boolean status;
	double salary;
	static String lastName;
	//default values
	public static void main(String[] args) {
		
		int total=10;// local variable should be initialized
		System.out.println(total);
		total=20;
		System.out.println(total);
		EmpTest e1=new EmpTest();
		System.out.println(e1.name);//null
		System.out.println(e1.age);//0
		System.out.println(e1.status);//false
		System.out.println(e1.salary);//0.0
		System.out.println(EmpTest.lastName);//null
		
		final int days=7;
		System.out.println(days);
		//days=10;
		System.out.println(days);
		System.out.println(100*days);
	
	}

}
