//*** Nov 11-P1*****
package ExceptionHandling;

//Exception - An unwanted event that occurs in the runtime.
public class TryCatchBlock {

	public static void main(String[] args) {
		
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
		//try - catch block
		try 
		{
		int i=9/0;// divide by zero
		}
		//catch will have to handle the exception
		catch(ArithmeticException e) 
		{	
		System.out.println("some exception is coming...bye");
		e.printStackTrace();
		System.out.println(e.getMessage());
		}
		System.out.println("Hi");
		System.out.println("Hi");
		
	}

}
