package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAll {
	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		a1.add("abhishek");
		a1.add(10);
		a1.add(null);
		a1.add('Y');
		a1.add(10.20);
		a1.add("abhishek");
		
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList(a1);
		a2.add("a2 ka data");
		System.out.println(a2);
		
		
		
	}

}
