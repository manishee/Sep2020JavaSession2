//** Nov 16-P5***
package AccessM2;

import AccessM1.Emp;

public class vendor {
//different package non sub class
	public static void main(String[] args) {
		
		vendor v=new vendor();
//		System.out.println(v.name);
//		System.out.println(v.age);
//		System.out.println(v.salary);
//		System.out.println(v.c);
		
		Emp e=new Emp();
		System.out.println(e.name);
//		System.out.println(e.age);->private
//		System.out.println(e.salary);->protected
//		System.out.println(e.c);->default
		
	}

}
