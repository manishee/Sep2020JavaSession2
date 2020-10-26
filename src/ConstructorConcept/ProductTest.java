//****************** Oct 23 -P4 ******************
package ConstructorConcept;

import java.util.ArrayList;

public class ProductTest {

	public static void main(String[] args) {
		
		Product p1=new Product("Nike Shoes", 50.25);
		System.out.println(p1.name + " " +p1.price);
		
		ArrayList<String> appleSellerList=new ArrayList<String>();
		appleSellerList.add("BestBuy");
		appleSellerList.add("Apple");
		appleSellerList.add("Staples");
		
		
		Product p2=new Product("Macbook", 2300.34, "Silver", appleSellerList);
		System.out.println(p2.name + " " + p2.price +" " +p2.color + " " +p2.sellerList);
		System.out.println(p2.sellerList.get(1));
		
		//for each loop
		for (String data : p2.sellerList) {
			System.out.println(data);
		}
	}

}
