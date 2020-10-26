//************** Oct 26 - P3**************
package OOP_Encapsulation;

public class Company {

	private String name;
	private int totalEmployee;
	private int sharePrice;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalEmployee() {
		return totalEmployee;
	}
	public void setTotalEmployee(int totalEmployee) {
		this.totalEmployee = totalEmployee;
	}
	public int getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	
	private void getPrivacyPolicy() {
		System.out.println("get privacy policy");
	}
	
	public void getPolicyInfo() {
		getPrivacyPolicy();
	}

	
}
