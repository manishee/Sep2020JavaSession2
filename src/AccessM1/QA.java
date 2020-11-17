//** Nov 16-P2***
package AccessM1;
//same package sub class
public class QA extends Emp{

	public static void main(String[] args) {
		
		QA qa=new QA();
		System.out.println(qa.name);
		//System.out.println(qa.age);->Private
		System.out.println(qa.salary);
		System.out.println(qa.c);

	}

}
