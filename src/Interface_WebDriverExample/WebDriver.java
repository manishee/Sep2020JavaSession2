// ************ Nov 9 -P2 ************
package Interface_WebDriverExample;

public interface WebDriver extends SearchContext {

	public void get(String url); //launches the url
	
	public String getTitle(); //returns the title of the page
	
	public void click();// click on a particular element
	
	public void sendKeys(String value);// send some values
	
	public void quit();//quit the browser




}
