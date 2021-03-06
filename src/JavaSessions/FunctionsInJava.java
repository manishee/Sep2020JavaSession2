//********************** Oct 16 ************************
package JavaSessions;

public class FunctionsInJava {
			//Functions and methods are synonyms
			//Functions will reduce code
			//We can achieve reuseability using functions
			//Functions are independent of each other
			//Functions are parallel to each other
			//We can't create a function inside a function
			//main()method is also a function
			//Functions are created inside a class
			//we can call a function from another function
			//a function can or can't return anything
	
	public static void main(String[] args) {
		
		FunctionsInJava obj=new FunctionsInJava();
		
		obj.test();
		obj.printName();
		obj.total();
		int sum=obj.add();
		System.out.println(sum+5-10);
		System.out.println(obj.add());
		String city=obj.printCityName();
		System.out.println(city);
		int s1=obj.getSum(40, 80);
		System.out.println(s1);
		int s2=obj.getSum(100, 760);
		System.out.println(s2);
		String cityName=obj.getCapitalName("Germany");
		System.out.println(cityName);
		int m=obj.getStudentMarks("Sheetal");
		System.out.println(m);
		
		if(obj.launchBrowser("Opera")){
			System.out.println("execute test cases");
			
		}else {
			System.out.println("test cases not executed");
		}
		
	}
	//public --> publicly accessible
	// void --> doesnt return anything
	// There are 3 types of functions
	//naming convention - camel case -lowercaseUppercase
	
	//1. no input and no return
	public void test() {
		System.out.println("inside test method");
	}

	public void printName() {
		System.out.println("Java and Selenium");
	}
	
	public void total() {
		System.out.println("inside total method");
		int x=10;
		int y=20;
		int z=x+y;
		System.out.println(z);
	}
	
	//2. no input and some return
	public int add() {
		System.out.println("inside add method");
		int a=100;
		int b=200;
		int c =a+b;//c=300
		return c;
	}
	// a method can return only one value at a time
	public String printCityName() {
		System.out.println("inside printCityName method ");
		String city="New Delhi";
		int t=100;
		return city;
		//return t;
	}
	
	//3. some input and some output
	public int getSum(int a, int b) {
		System.out.println("inside getSum method");
		int sum=a+b;
		return sum;
	}
	
	//WAP to get capital name when the country name is provided.
	
	public String getCapitalName(String countryName) {
		System.out.println("Getting capital name for " + countryName);
		if(countryName.equals("India")) {
			return "New Delhi";
		}else if (countryName.equals("USA")) {
			return "DC";
		}else if (countryName.equals("UK")) {
			return "London";
		}else if (countryName.equals("Canada")) {
			return "Ottawa";
		}else {
			System.out.println("Country Name is not found");
			return null;
		}
	}
	
	//WAM where a student name(String) is passed and the marks(int) are returned
	
	public int getStudentMarks(String name) {
		int marks=0;
		//null value is used for string and objects 
		System.out.println("getting the marks for " +name);
		
		if(name.equals("Mohan")) {
			marks=95;
		}
		else if(name.equals("Kanika")) {
			marks=90;
		}
		else if(name.equals("Pratik")) {
			marks=100;
		}
		else if(name.equals("Rahul")) {
			marks=10;
		}
		else {
			System.out.println("Student not found " +name);
			return -1;
		}
		
		return marks;
	}
	
	// WAM where we will pass the browsername and launch the browser and return boolean
	// use switch statement
	public boolean launchBrowser(String browserName) {
		System.out.println("Launching browser: " + browserName);
		boolean flag=false;
		switch (browserName) {
		case "chrome":
			System.out.println("Launching chrome");
			flag=true;
			break;
		case "firefox":
			System.out.println("Launching firefox");
			flag=true;
			break;
		case "safari":
			System.out.println("Launching safari");
			flag=true;
			break;
		default:
			System.out.println("Browser not found " +browserName);
			break;
		}return flag;
	}
	
	
}
