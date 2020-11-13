//***Nov 13-P2***
package JavaSessions;

public class FinallyConcept {

	public static void main(String[] args) {
		
		//finally is associated with try-catch block
		//finally is a block .. it will be executed all the time doesnt matter
		//if the exception is coming or not
		
		int p=10;
		try
		{
		System.out.println("this is before exception");
		System.out.println("DB Connection -- trying to establish");
		System.out.println("DB Connection -- is DONE");
		int z=p/0;
		}
		catch(ArithmeticException e)
		{
		System.out.println("some exception is coming");	
		}
		finally
		{
		System.out.println("executing finally block");
		System.out.println("Flush/Close the connection");
		}
		
		int m=getMarks("Neh");
		System.out.println(m);
	}
	
	public static int getMarks(String name) {
		
		try
		{
		if(name.equals("Neha")) {
			return 90;
		}else if(name.equals("Ali")) {
			return 95;
		}else if(name.equals("Tarun")) {
			return 87;
		}else {
			return -1;
		}
		}catch(Exception e)
		{
		return -2;	
		}
		finally
		{
		System.out.println("bye");
		return -3;	
		}
		}
	}


