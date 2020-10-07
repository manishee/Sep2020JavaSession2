package SeleniumSessions;

public class LoopsConcept {

	public static void main(String[] args) {
	
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
		
		//1. While loop
		
		int i=1;// Initialization -> is not part of while loop
		while(i<=10) { // conditional
			System.out.println(i);
			i++; // increment part
		}
		
		//2. for loop
		System.out.println("---------------------------");
		for(int k=1; k<=10;k++) {//Initialization -> is part of for loop
			System.out.println("the value of k is " +k);
		}
	
		System.out.println("---------------------------");	
		
		
		//WAP to print the even numbers between 0 and 10
		// 0 2 4 6 8 10
		for(int even=0; even<=10; even=even+2) {
			System.out.println(even);
		}
		
		System.out.println("---------------------------");	
		//WAP to print the odd numbers between 0 and 10
		// 1 3 5 7 9
		for(int odd=1; odd<10; odd=odd+2) {
			System.out.println(odd);
		}
		System.out.println("---------------------------");	
	
		for (int p=1;p<=10;){
			System.out.println(p);
			p++;
		}
		System.out.println("---------------------------");	
		for (int h=1; h<=100; h++) {
			System.out.println(h);
			if(h%5==0) {
				System.out.println("hiiiii");
			}
		}
		System.out.println("---------------------------");
		
		for (char c='a'; c<='z'; c++) {
			System.out.println(c);
		}
		System.out.println("---------------------------");
//		for(String st="Welcome to Hotel Taj"; st.equals("Welcome to Hotel Taj");) {
//			System.out.println(st);
//		}
		
//		for( ; ; ) {
//			System.out.println("without");
//		}
	
		//3. do-while loop
		System.out.println("---------------------------");
		int n=1;
		do {
			System.out.println("The value of n is " +n);
			n++;
		}
		while(n<=10);
	}
	
	
}
