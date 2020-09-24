package SeleniumSessions;

public class ConditionalOpeartorsIfElseCondition {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println(a>b);
		if(a>b) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
		}
		if(true) {
			System.out.println("hi");
		}else {
			System.out.println("Bye");
		}
		
		String s="Hello";
		String s1="h ello";// h ello
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
		 int total=1000;
		 int fee=100; //= is assignment operator
		 if(total==fee) {//== is comparison operator
			 System.out.println("total is fee");
	}else {
		System.out.println("total is not fee");
	}
	}
}
