package SeleniumSessions;

public class ConditionalOperatorsIfElseCondition {

	public static void main(String[] args) {
		//testing again
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
			System.out.println("Bye");//dead code
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
		 //if(total=="100") {int to String comparison not possible
			// System.out.println("this is correct");
		// }
		 if(200==200) {
			 System.out.println("this is also correct");
			 
		 }
		 if(12.22==12) {
			 System.out.println("it is possible");
		 }
		 //> < >= <= == !=
		 int c=2000;
		 int d=2000;
		 if(d>=c) {
			 System.out.println("Pass");
		 }
		 int balance=101;
		 if(balance !=100) {
			 System.out.println("bal is not correct");
		 }
		 
		 int marks=101;
		 if(marks>=90) 
		 {
			if(marks<=100) 
			{
			 System.out.println("pass");
		 }else {
			 System.out.println("wrong marks");
		 }
			}
		 else {
			 System.out.println("Fail");
		 }
	// WAP to find out the highest when three different numbers are given
		 int x=65;
		 int y=60;
		 int z=70;
		 
		 if(x>y&&x>z) {//&& AND --> short circuit operator
			 //true && true = true
			 // || -->OR operator
			 System.out.println("x is greatest");
		 }else if(y>z) {
			 System.out.println("y is greatest");
		 }else {
			 System.out.println("z is greatest");
		 }
		 
		 //WAP to check the browser value and the launch the respective
		 //browser
		 //1. if
		 String browser="chrome";
		 
		 if(browser.equals("chrome")) {
			 System.out.println("launch chrome browser");
		
		 }
		 if(browser.equals("firefox")) {
			 System.out.println("launch firefox browser");
			 
		 }
		 if(browser.equals("ie")) {
			 System.out.println("launch ie browser");
		 }
		 if(browser.equals("safari")) {
			 System.out.println("launch safari browser");
		 }
		 else {
			 System.out.println("please pass the correct browser name");
		 }
		 
		 //2. if-else if
//		 if(browser.equals("chrome")) {
//			 System.out.println("launch chrome");
//		 }
//		 else if(browser.equals("firefox")) {
//			 System.out.println("launch firefox");
//		 }
//		 else if(browser.equals("ie")) {
//			 System.out.println("launch ie");
//		 }
//		 else if(browser.equals("safari")) {
//			 System.out.println("launch safari");
//		 }
//		 else {
//			 System.out.println("please pass correct browser");
//		 }
		 
		 
		 //3. switch // switch then hit cntrl+space
//		 switch (browser) {// browser=chrome
//   		case "chrome":
//			System.out.println("launching chrome browser");
//			break;
//   		case "firefox":
//			System.out.println("launching firefox browser");
//			break;
//   		case "ie":
//			System.out.println("launching ie browser");
//			break;
//   		case "safari":
//			System.out.println("launching safari browser");
//			break;
//		default:
//			System.out.println("please provide right browser");
//			break;
//		}
		 
	}
}
