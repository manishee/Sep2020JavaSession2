//** Nov 16-P6***
package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {

		//String to int conversion
		String x="100";
		System.out.println(x+20);
		
		int i=Integer.parseInt(x);//static method
		System.out.println(i+20);
		
		//Amount =1000 -> when we read something from a webpage
		//we always get string
		
		//String to double conversion
		String y="34.55";
		System.out.println(y+20);
		
		double d=Double.parseDouble(y);//static method
		System.out.println(d+20);
		
//		String h="100A";//NumberFormatException
//		
//		int p=Integer.parseInt(h);
//		System.out.println(p+20);
		
		//int to String conversion
		
		int k=100;
		System.out.println(k+20);
		String k1=String.valueOf(k);
		System.out.println(k1+20);
	}

}
