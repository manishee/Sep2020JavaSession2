//*** Nov 16-P4***

package AccessM2;
import AccessM1.Emp;//import statement has to be the second statement

//different package sub class
public class HR extends Emp{

	public static void main(String[] args) {

		HR hr=new HR();
		System.out.println(hr.name);
		//System.out.println(hr.age);->private
		System.out.println(hr.salary);
		//System.out.println(hr.c);->default
		
	}

}
