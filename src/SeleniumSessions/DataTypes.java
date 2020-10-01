package SeleniumSessions;

public class DataTypes {

	public static void main(String[] args) {
		/*
		 * comments entered by Manish
		 * This code is for datatypes edited by Manish on Sep 16, 2020
		 */
		//Data Types
		// integer family - byte, short, int, long
		// floating family - float, double
		// character family - char
		// boolean- true and false
		// String
		
		
		
		//1. byte
		//size : 1 byte=8 bits
		//range: -128 to 127
		byte b=100;
		byte b1=20;
		byte b2=0;
		byte b3=-30;
		// syso+cntrl+space
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b+b1+b3);
		
		//2. short
		//size: 2 bytes = 16 bits
		//range: -32768 to 32767
		short s1=10;
		short s2=-1000;
		System.out.println(s1);
		System.out.println(s1+s2);
		
		//3. int
		//range = -2147483648 to 2147473647
		//size: 4 bytes=32 bits
		int i=10;
		int total=20000;
		System.out.println(i);
		System.out.println(total);
		
		//4. long
		//size: 8 bytes=64 bits
		//range: check?
		long l=434234333;
		System.out.println(l);
		
		//5. float
		// size: 4 bytes= 32 bits
		// range: around 7 digits after decimal
		float f=12.33f;
		float f1=(float)23.44;
		float f3=100;//100.0
		System.out.println(f);
		System.out.println(f+f1);
		System.out.println(f3);
		
		//6. double
		//size: 8 bytes = 64 bits
		//range : 15 digits after decimal
		double d=23.33;
		double d1=34.873838;
		System.out.println(d);
		System.out.println(d1);
		
		//7. char
		// size : 2 bytes=16 bits
		char c='a';
		char c1='b';
		char c2='1';
		char c3='$';
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c+c1);//97+98=195
		//ascii values
		//a-z --> 97-122
		//A-Z --> 65-90
		//0-9 --> 48-57
		
		//8. boolean
		//size = 1 bit
		boolean flag= true;
		boolean test= false;
		System.out.println(flag);
		System.out.println(test);
		
		//9. String -> In Java String is not a data type, its a class
		String str="Hello";
		System.out.println(str);
		
		String str1="100";
		System.out.println(str1);
		
		System.out.println(str+str1);
		System.out.println(1000);
		System.out.println(10+20);
		System.out.println("testing" +100);
		
		System.out.println("Hello" + "World");
		System.out.println("Hello " + "World");
		System.out.println("Hello" + " World");
		System.out.println("Hello" + " " +"World");
		
		System.out.print(80);
		System.out.println(60);
		System.out.println(70);
		//print -> just prints but doesn't generate new line
		//println -> prints & generates a new line
		
		System.out.print(80+"\n");
		System.out.println(60);
		// print in red
		//System.err.println("print something in red color");
		
		System.out.println(4/2);
		System.out.println(5%2);// remainder
	}

}
