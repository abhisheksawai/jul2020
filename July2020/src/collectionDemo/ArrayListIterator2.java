package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIterator2 {
	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		a1.add("abhishek");
		a1.add(10);
		a1.add(null);
		a1.add('Y');
		a1.add(10.20);
		a1.add("abhishek");
		
		ListIterator it = a1.listIterator();  //Returns an iterator over the elements in this list in proper sequence. 
		
		while(it.hasNext())  // return true if iteration has more element
		{
			System.out.println(it.next());  // to 
		}
			System.out.println("previous method to travel back");
			
			while(it.hasPrevious())  // return true if iteration has more element
			{
				System.out.println(it.previous());  // to 
			}
			
			
			
			
	}

}
