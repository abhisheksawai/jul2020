package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {
	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		a1.add("abhishek");
		a1.add(10);
		a1.add(null);
		a1.add('Y');
		a1.add(10.20);
		a1.add("abhishek");
		
		System.out.println(a1);
		
		System.out.println("after adding on key");
		a1.add(2, "two");  // 
		
		System.out.println(a1);
		
	}

}
