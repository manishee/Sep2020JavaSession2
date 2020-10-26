package JavaSessions;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {

		//1. post increment
		int a=1;
		int b=a++; //++ means increment the value by 1
		//++ is written after a --> means post increment
		System.out.println(a);//2
		System.out.println(b);//1
		
		int m=-1;
		int n=m++;
		System.out.println(m);//0
		System.out.println(n);//-1
		
		//2. pre increment
		
		int p=1;
		int q=++p;
		System.out.println(p);//2
		System.out.println(q);//2
		
		//3. post decrement
		
		int r=2;
		int e=r--;// -- means decrement by 1
		System.out.println(r);//1
		System.out.println(e);//2
		
		//4. pre decrement
		int s=2;
		int f=--s;
		System.out.println(s);//1
		System.out.println(f);//1
		
		int v=2;
		System.out.println(v++);//2
		System.out.println(v);//3
	}

}
