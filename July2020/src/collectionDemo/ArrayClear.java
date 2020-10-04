package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayClear {
	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		a1.add("abhishek");
		a1.add(10);
		a1.add(null);
		a1.add('Y');
		a1.add(10.20);
		a1.add("abhishek");
		
		System.out.println(a1);
		a1.clear();
		
		
		System.out.println(a1);
	}

}
