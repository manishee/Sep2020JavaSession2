//***Nov 25-P1***

package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {

		//String is a collection of multiple characters
		//String is maintaining these characters in a character array
		
		String str= "Hello This is my first java code and I am so happy";
		
		System.out.println(str.length());//44
		System.out.println("Li= " +0);
		System.out.println("Hi= " +(str.length()-1));
		System.out.println("-----------");
		
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(43));
		System.out.println("-----------");
		//System.out.println(str.charAt(44));//StringIndexOutOfBoundsException
		
		System.out.println(str.indexOf("m"));
		System.out.println(str.indexOf("i"));//first occurrence of i
		//System.out.println(str.indexOf("i", 3));
		System.out.println(str.indexOf("i", str.indexOf("i")+1));
		System.out.println("-----------");
		
		System.out.println(str.indexOf("java"));//we can search for a particular string
		System.out.println(str.indexOf("manish"));//-1
		
		System.out.println("-----------");
		String messg="welcome admin";
		if(messg.indexOf("admin")==0) {//8>0
			System.out.println("correct welcome message");
		}
		else {
			System.out.println("incorrect welcome message");
		}
		System.out.println("-----------");
		
		//trim:
		String s="   hello World    ";
		System.out.println(s);
		System.out.println(s.trim());//trim the spaces from the corners
		System.out.println(s.trim().replace(" ", ""));
		System.out.println("-----------");
		
		
		String dob="01-01-1980";//01/01/1980
		System.out.println(dob.replace("-", "/"));
		
		System.out.println("-----------");
		String s1="this is my java code";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println("-----------");
		
		
		String s2="HELLO WELCOME TO THE TESTING WORLD";
		System.out.println(s2.toLowerCase());
		System.out.println("-----------");
		
		
		//contains:
		String s3="Your browser is chrome";
		System.out.println(s3.contains("chrome"));
		System.out.println("-----------");
		String browser="chrome";// case sensitive
		if(browser.equals("chrome")) {
			System.out.println("launch chrome browser");
		}
		System.out.println("-----------");
		System.out.println(browser.equalsIgnoreCase("chrome"));
		System.out.println("-----------");
		
		
		String f1="Hello World";
		String f2="hello World";
		System.out.println("-----------");
		
		
		System.out.println(f1.equals(f2));
		System.out.println(f1.equalsIgnoreCase(f2));
		
		System.out.println("-----------");
		
		
		System.out.println(f1+f2);
		System.out.println(f1.concat(f2));
		
		
		System.out.println("-----------");
		//split
		//  remove ; and split
		String lang="Java;Python;JavaScript;Ruby";
		String language[]=lang.split(";");
		
		
		System.out.println("-----------");
		System.out.println(language.length);
		System.out.println(language[0]);
		
		//for each 
		for(String ele : language) {
			System.out.println(ele);
		}
		
		System.out.println("-----------");
		
		for(int i=0; i<language.length; i++) {
			System.out.println(language[i]);
		}
		System.out.println("-----------");
		String empData="Neha;Kashyap;25;London;UK;98999;IBM";
		String emp[]=empData.split(";");
		
		for(String element : emp) {
			System.out.println(element);
		}
		System.out.println("-----------");
		String test="xXtestingxXXSeleniumXxXCucumber";
		String tester[]=test.split("xX");
		System.out.println("0th --->" +tester[0]);
		System.out.println("1st --->" +tester[1]);
		System.out.println("2nd --->" +tester[2]);
		System.out.println("3rd --->" +tester[3]);
		
		System.out.println("-----------");
		//substring
		String main="Your total amount is 3000";
		//return substring starting from index 5 till the end of the string
		System.out.println(main.substring(5));
		System.out.println(main.substring(5, 12)); //end index-1
		
		System.out.println(main.substring(main.indexOf("is")));
		String amount = main.substring(main.indexOf("is")+3);
		
		System.out.println(amount);
		System.out.println(amount+50+10);//30005010
		System.out.println(amount+(50+10));//300060
		
		//String to int
		
		int amountval=Integer.parseInt(amount);
		System.out.println(amountval+50+10);//3060
		
	}

}
