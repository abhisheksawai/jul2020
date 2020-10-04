package collectionDemo;

import java.util.ArrayList;

public class ListCompare {
	
	public static void main(String[] args) {
		
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("abhishek");
		a3.add("shishir");
		a3.add("compare");
				
		System.out.println("first list");
		System.out.println(a3);
		ArrayList<String> a4 = new ArrayList<String>();
		
		a4.add("compare");
		a4.add("abhishek");
		a4.add("shishir");
		
		
		System.out.println("second list");
		System.out.println(a4);
		
		System.out.println("comapre a3.equals(a4)");
		System.out.println(a3.equals(a4));
		
	}

}
