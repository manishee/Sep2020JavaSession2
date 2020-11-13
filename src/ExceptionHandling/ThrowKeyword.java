//** Nov 13-P1***
package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
	
		//Throw keyword is used to generate our own exception
		//Advantages
		//1. proper error messaging
		//2. deliberately generate own exception
		
		System.out.println("Hello Testing");
//		try
//		{
//		throw new Exception("some exception is coming");
//		}
//		catch(Exception e)
//		{
//		e.printStackTrace();	
//		}
		
		String s=null;
		if(s==null) { //i want to throw my own exception
			System.out.println("Bye...");
			
			try 
			{
			throw new Exception("Excel Value Exception -- value is null");	
			}
			catch(Exception e)
			{
			e.printStackTrace();	
			}
		}
		
		
	}

}
