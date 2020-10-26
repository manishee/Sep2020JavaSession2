//**************** Oct 19 *******************
package JavaSessions;

import java.util.ArrayList;

public class Employee {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		String assets_Sam[]=e1.getEmployeeAssets("Sam");
		// for each loop
		for(String data : assets_Sam) {
			System.out.println(data);
		}
		
		String assets_Tom[]=e1.getEmployeeAssets("Tom");
		// for each loop
		for(String ele : assets_Tom) {
			System.out.println(ele);
		}
		System.out.println("---------------");
		
		ArrayList<String>orderList_Tom=e1.getEmpOrders("Tom");
		System.out.println("Total Orders is " + orderList_Tom.size() );
		//for each
		for(String data : orderList_Tom) {
			System.out.println(data);
		}
		System.out.println("---------------");
		ArrayList<String>orderList_Steve= e1.getEmpOrders("Steve");
		System.out.println("Total Orders is " + orderList_Steve.size() );
		//for each
		for(String elements : orderList_Steve) {
			System.out.println(elements);
		}System.out.println("---------------");
		ArrayList<String>orderList_Steven=e1.getEmpOrders("Steven");
		
	}
	
	//WAM where we have to pass the emp name(String) and return the employee assets(Array)
	
	public String[] getEmployeeAssets(String empName) {
		System.out.println("emp name is " +empName);
		
		String asset[]=new String[4];
		
		if(empName.equals("Sam")) {
			asset[0]="Macbook Pro";
			asset[1]="Keyboard";
			asset[2]="Mouse";
			asset[3]="IPhone X";
		}else if(empName.equals("Tom"))
		{
			asset[0]="Windows Laptop";
			asset[1]="Keyboard";
			asset[2]="Mouse";
			asset[3]="Head phones";
		}else {
			System.out.println("this employee " + empName + " is not found, please check");
			return null;
		}
		return asset;
	}
	
	//WAM where we get order list based on the name of the employee
	
	public ArrayList<String> getEmpOrders(String empName) {
		System.out.println("get emp orders for " +empName);
		
		//Generics
		ArrayList<String> orderList=new ArrayList<String>();
		
		if(empName.equals("Tom")) {
			orderList.add("Iphone");
			orderList.add("Laptop");
			orderList.add("Tshirt");
			orderList.add("Shoes");
		}
		
		else if(empName.equals("Steve")) {
			orderList.add("IphoneX");
			orderList.add("Laptop Windows");
		}
		
		else {
			System.out.println("This emp " + empName + " is not found, please check");
		}
		return orderList;
	}
	
	
	
	
	

}
