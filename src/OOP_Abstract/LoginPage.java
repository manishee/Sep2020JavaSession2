//**************** Nov 4- P3 ***********
package OOP_Abstract;

public class LoginPage extends Page{

	
	public LoginPage() {
		System.out.println("Login page --- constructor");
	}
	
	@Override
	public void title() {
		System.out.println("LP - title");
	}

	@Override
	public void url() {
		System.out.println("LP - url");
		
	}
	
	public void forgotPwd() {
		System.out.println("LP -- ForgotPwd");
	}

}
