package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGet {
	
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
		System.out.println("printing in for loop");
		for(int i = 0 ; i <a1.size() ; i ++)
		{
			System.out.println(a1.get(i));  //Returns the element at the specified position in this list
			
		}
		
	}

}
