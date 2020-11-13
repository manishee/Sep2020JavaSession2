//**Nov 11-P3***
package ExceptionHandling;

public class ThrowsKeyword {

	//Throws Keyword - Throws keyword is not used to handle the exception
	//It is used to pass the exception to another method
	public static void main(String[] args) {

		ThrowsKeyword obj=new ThrowsKeyword();
		obj.m1();
	}

	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
//		try 
//		{
//		m3();
//		}
//		catch(ArithmeticException e) 
//		{
//			System.out.println("AME is coming");
//		}
		
	}
	
	public void m3(){
		System.out.println("m3 method");
		try
		{
		int i=9/0;
		}
		catch(ArithmeticException e)
		{
		System.out.println("AME is coming");
		}
	}
	
}
