//***Nov 23- P3***
package JavaSessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {

		//special collection which stores the values in form of key-value pair
		//can have only one null key
		//can have any number of null values
		//top casting
		Map<String, String> EmpMap=new HashMap<String, String>();
		EmpMap.put("name", "Tom");//put method --> to add key and value
		EmpMap.put("ID", "101");
		EmpMap.put("City", "Montreal");
		EmpMap.put(null, "21");
		EmpMap.put("phone", null);
		EmpMap.put("Country", null);
		
		System.out.println(EmpMap.get("name"));//get method -> to get the value based on the key
		System.out.println(EmpMap.get("ID"));
		System.out.println(EmpMap.get("City"));
		System.out.println(EmpMap.get("Country"));
		System.out.println(EmpMap.get(null));
		System.out.println(EmpMap.get("phone"));
		

		//we cant use for loop.. we can for each loop
	
		System.out.println("---------");
	
		//keySet() -> for getting the keys
 		for(String s : EmpMap.keySet()) {
			System.out.println("key = " + s);
		}
	
 		System.out.println("---------");
 		//values() -> to get the values
 		for (String v : EmpMap.values()) {
 			System.out.println("value = " +v);
 		}
	
 		System.out.println("---------");
 		for(Map.Entry<String, String> entry : EmpMap.entrySet())
{	
 			System.out.println("key = " +entry.getKey() + " "+"value = " + entry.getValue());
}
 		//Lambda:after Java1.8
 		System.out.println("---------");
 		EmpMap.forEach((k,v) ->  System.out.println("key = " + k + " "+ "value " +v));
	
	}
}
