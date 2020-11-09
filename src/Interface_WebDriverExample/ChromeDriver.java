//*********** Nov9-P3*************
package Interface_WebDriverExample;

public class ChromeDriver implements WebDriver{

	public ChromeDriver() {
		
		System.out.println("Launch Google Chrome");
	}
	@Override
	public void findElement(String locator) {
		System.out.println("find the element using the locator " + locator);
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
