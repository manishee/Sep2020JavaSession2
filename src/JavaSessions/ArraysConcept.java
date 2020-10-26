package JavaSessions;

public class ArraysConcept {

	public static void main(String[] args) {
		
		//int h;
	//int i=10;
	// i=20;
//		System.out.println(i);
//		i=30;
//		i=40;
//		System.out.println(i);
		//Array --> to hold multiple values of same datatypes
		
		int i[]=new int[4];// new -> allocate memory space
		
		i[0]=10;//lowest index or li=0
		i[1]=20;
		i[2]=30;
		i[3]=40;//highest index =3
		//i[4]=50;//java.lang.ArrayIndexOutOfBoundsException: 4
		
		//length of array=4
		//hi = length-1
		//length=hi+1
		System.out.println("li =" +0);
		System.out.println(i.length);//length of the array will be calculated on 
		// the variable name
		System.out.println("hi =" + (i.length-1));
		//length method is used to calculate length/size of an Array
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//java.lang.ArrayIndexOutOfBoundsException: 4
		//System.out.println(i[-1]); //java.lang.ArrayIndexOutOfBoundsException: -1
		System.out.println("-----");
		int l=i.length;//4
		System.out.println(l);
		System.out.println("----------");
		
		for(int p=0; p<=i.length-1; p++) {
			System.out.println(i[p]);
		}
		
		System.out.println("----------");
		// For each loop
		for(Integer ele : i) {
			System.out.println(ele);
		}
		System.out.println("----------");
		
		//double array
		double d[]=new double[2];
		d[0]=12.33;
		d[1]=23.33;
		System.out.println(d.length);
		System.out.println(d[0]);
		
		System.out.println("----------");
		
		//Char Array
		char c[]=new char[2];
		
		//String Array
		String student[]=new String[5];
		
		student[0]="Angelo";
		student[1]="Tenveer";
		student[2]="Sabitha";
		student[3]="Tatiana";
		student[4]="Manish";
		
		System.out.println(student[0]);
		System.out.println(student[2]);
		
		for(String h : student) {
			System.out.println(h);
		}
		System.out.println("---------");
		for(int h=0; h< student.length; h++) {
			System.out.println(student[h]);
		}
		
		//Limitation of Arrays
		//1. size is fixed or static array
		//2. stores only similar kind of data -> we can overcome this by using object array
		
		Object obj[]=new Object[5];
		
		obj[0]="tom";
		obj[1]='m';
		obj[2]=25;
		obj[3]=true;
		obj[4]=12.22;
		
		for(int ii=0; ii<obj.length; ii++) {
			System.out.println(obj[ii]);
		}

		//for each loop
		for(Object data : obj) {
			System.out.println(data);
		}
		
		//ways to declare and initialize arrays
		
		int a1[]=new int[2];
		//int[] a1=new int[2];
		//int a1[]=new int[] {10,20};
		//int a1[]= {10,20};
		a1[0]=10;
		a1[1]=20;
		for (Integer element : a1) {
			System.out.println(element);
		}
		
	}

}
