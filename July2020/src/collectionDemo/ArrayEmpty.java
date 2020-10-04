package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayEmpty {
	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		a1.add("abhishek");
		a1.add(10);
		a1.add(null);
		a1.add('Y');
		a1.add(10.20);
		a1.add("abhishek");
		
		System.out.println("before replace");
		System.out.println(a1);
		a1.set(2, "replaceitemisthis");
		System.out.println("after replace");
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList();
		
		System.out.println(a1.isEmpty());
		System.out.println(a2.isEmpty());
	}

}
