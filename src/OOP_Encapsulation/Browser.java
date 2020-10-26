//************* Oct 26- P4 *************
package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("Launching Browser");
		checkBrowserVersion();
		checkBrowserOSVersion();
		interactWithOSServices();
		checkRAMSpace();
		System.out.println("Chrome browser is launched");
	}
	
	private void checkBrowserVersion() {
		System.out.println("check Browser Version");
	}
	
	private void checkBrowserOSVersion() {
		System.out.println("check Browser OS Version");
	}
	
	private void interactWithOSServices() {
		System.out.println("interact With OS Services");
	}
	
	private void checkRAMSpace() {
		System.out.println("check RAM Space");
	}
	
	
	
}
