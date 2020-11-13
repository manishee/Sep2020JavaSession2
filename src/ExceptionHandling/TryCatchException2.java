//********* Nov 11-P2*******
package ExceptionHandling;

public class TryCatchException2 {
	String name="Tom";
	public static void main(String[] args) {

		
		System.out.println("Hello Testing");
		
		TryCatchException2 obj=new TryCatchException2();
		obj=null;
		
		try
		{	System.out.println("before exception");
			int i=9/3;//AME
			System.out.println(obj.name);//NPE
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("some AME exception");
			//e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			System.out.println("some NPE exception");
			//e.printStackTrace();
		}
		System.out.println("Bye!");
	}

}
