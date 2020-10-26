package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		double c=12.33;
		double d=23.33;
		
		int a=100;
		int b=200;
		
		String x="Hello";
		String y="Testing";
		
		System.out.println(c+d);
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(x+y+c+d+a+b);
		
		System.out.println("the value of a is: " +a);
		System.out.println("the value of b is: " +b);
		System.out.println("the sum of a and b is: " +(a+b));
		
		System.out.println(c+d+x+y+a+b);
		
		int i=4/2;
		System.out.println(i);
		System.out.println(4/2);
		
		System.out.println(5/2);//2 because 5 and 2 both are integers
		System.out.println(5.0/2);//2.5 because 5.0 is floating
		System.out.println(5/2.0);//2.5 because 2.0 is floating
		System.out.println(5.0/2.0);//both are floating
		
		//int k=9/2.0;
		double k=9/2.0;
		System.out.println(k);
		float f=(float)(9/2.0);
		float f1=9/2.0f;
		
		//int p=9/0;//java.lang.ArithmeticException: / by zero
		int p1=0/9;
		System.out.println(p1);
		
		//int n=0/0;
		//System.out.println(n);//java.lang.ArithmeticException: / by zero
		
		System.out.println("hello " +('a'+'b'));
		
	}

}
