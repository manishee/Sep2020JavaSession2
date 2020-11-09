//**** Nov 9-P4***********
package Interface_WebDriverExample;

public class FirefoxDriver implements WebDriver{
	
	public FirefoxDriver() {
		
		System.out.println("Launch Firefox");
	}
	
	@Override
	public void findElement(String locator) {
		System.out.println("fine the element using the locator " + locator);
	}

	@Override
	public void get(String url) {
		System.out.println("Launch the url with : " + url);
	}

	@Override
	public String getTitle() {
		return "title of the page";
	}

	@Override
	public void click() {
		System.out.println("click on the element");
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("send the value :" + value);
	}

	@Override
	public void quit() {
		System.out.println("quit browser");
	}

}
