// *** Nov 23-P1***
package ThisKeyword;

public class EComm {

	// Builder Pattern using this keyword
	// return the current class object state
	
	
	public EComm login(String un, String pwd) {
		System.out.println("login with " + un + " : " + pwd);
		return this;
	}
	
	public EComm search(String productName) {
		System.out.println("search with :" +productName);
		return this;
	}
	//method overloading
	public EComm search(String productName, int price) {
		System.out.println("search with : " + productName + "price : " +price);
		return this;
	}
	
	public EComm addToCart(String productName) {
		System.out.println("Adding to Cart " + productName);
		return this;
	}
	
	public EComm checkOut(String productName) {
		System.out.println("checkout with product " + productName);
		return this;
		
	}
	
	public EComm doPayment(String CC, String pwd) {
		System.out.println("payment is done using: " + CC +" " + pwd);
		return this;
	}
	
	public EComm generateOrder(String productName) {
		System.out.println("Your order id is " + 12345 + "for this product " + productName);
		return this;
	}
	
	
}
