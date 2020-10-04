package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterator {
	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		a1.add("abhishek");
		a1.add(10);
		a1.add(null);
		a1.add('Y');
		a1.add(10.20);
		a1.add("abhishek");
		
		Iterator it = a1.iterator();  //Returns an iterator over the elements in this list in proper sequence. 
		
		while(it.hasNext())  // return true if iteration has more element
		{
			System.out.println(it.next());  // to 
		}
			
			
			
			
			
			
	}

}
