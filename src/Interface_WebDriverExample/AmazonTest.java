//*** Nov 9-P6********
package Interface_WebDriverExample;

public class AmazonTest {

	public static void main(String[] args) {

		
		
		//ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//SafariDriver driver=new SafariDriver();
		
		//top casting -- to do the cross browser testing
		
		WebDriver driver=null;
		
		
		String browser="edge";
		
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		
		}else if(browser.equals("safari")) {
			driver=new SafariDriver();
		}else {
			System.out.println("please pass the correct browser " + browser);
		}
		
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		driver.findElement("username");
		driver.sendKeys("admin@gmail.com");
		
		driver.findElement("password");
		driver.sendKeys("admin@123");
		driver.click();
		driver.quit();
		
	}

}
