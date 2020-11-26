// Nov 23-P2***
package ThisKeyword;

public class Shopping {

	public static void main(String[] args) {

		EComm e1=new EComm();
		
		e1
		.login("manish@gmail.com", "admin@123")
		.search("Macbook", 2000)
		.addToCart("Macbook")
		.checkOut("Macbook")
		.doPayment("2131 1233 1312 1234", "lfjls")
		.generateOrder("Macbook");
		
		System.out.println("-----");
		
		e1
		.login("angelo@gmai.com", "hkfhj")
		.addToCart("Nike shoes")
		.doPayment("2334 2342 2344 2342", "Test@1234")
		.generateOrder("Nike Shoes");
		
	}

}
