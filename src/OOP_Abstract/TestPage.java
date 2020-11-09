//**************** Nov 4- P4 ***********
package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {
		
		LoginPage lp=new LoginPage();
		//Page p=new Page();cant create object of an abstract class
		lp.title();
		lp.url();
		lp.timeOut();
		lp.forgotPwd();
		Page.logo();//static
		
		//top casting
		Page p=new LoginPage();
		p.title();
		p.url();
		p.timeOut();
		//p.forgotPwd();//reference check will fail
	}

}
