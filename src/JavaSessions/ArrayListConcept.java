package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
			
		ArrayList ar=new ArrayList(); // default class in java
		
		System.out.println(ar.size());//size is printing the physical capacity
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());
		ar.add(500);//4
		ar.add(600);//5
		ar.add(700);//6
		//System.out.println(ar.get(7));java.lang.IndexOutOfBoundsException: Index 7 out of bounds for length 7
		
		System.out.println(ar.size());
		ar.remove(6);
		ar.add(800);//7
		ar.add(900);//8
		ar.add(1000);//9
		ar.add(1100);//10
		
		System.out.println(ar.get(5));
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//Dynamic ArrayList with different data
		System.out.println("------------");
		ArrayList arr=new ArrayList();
		arr.add("Tom");
		arr.add('m');
		arr.add(38);
		
		for(int j=0; j<arr.size(); j++) {
			System.out.println(arr.get(j));
		}
		
		//generics
		System.out.println("----------");
		ArrayList<Integer> marksList=new ArrayList<Integer>();
		marksList.add(80);
		marksList.add(85);
		marksList.add(88);
		//marksList.add("Tom");
		//for each loop
		for(Integer ele : marksList) {
			System.out.println(ele);
		}
		System.out.println("-----------");
		
		ArrayList<String> countryList=new ArrayList<String>();
		countryList.add("USA");
		countryList.add("India");
		//for each loop
		for(String data : countryList) {
			System.out.println(data);
		}
		System.out.println("-----------");
		
		//empData --> empName, empAge, empGender, IsPerm, 
		ArrayList<Object> empData=new ArrayList<Object>();
		empData.add("Tom");
		empData.add(25);
		empData.add('m');
		empData.add(true);
		empData.add(34.55);
		
		for(int k=0; k<empData.size(); k++) {
			System.out.println(empData.get(k));
		}
		System.out.println("-----------");
		//for each loop
		for(Object data : empData) {
			System.out.println(data);
		}
	}

}
