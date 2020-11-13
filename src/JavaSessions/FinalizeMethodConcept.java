//**Nov 13-P3***
package JavaSessions;

public class FinalizeMethodConcept {

	//class variable
	int age;
	public static void main(String[] args) {

		//Finalize is a garbage collector method
		//before gc is called, finalize method is called
		String c=new String("Martin");
		FinalizeMethodConcept obj=new FinalizeMethodConcept();
		//obj=null;
		c=null;
		
		System.gc();// calling the gc method
		System.out.println("Done");
		
	}
	@Override
	public void finalize() {
		System.out.println("this is finalize method");
	}

}
