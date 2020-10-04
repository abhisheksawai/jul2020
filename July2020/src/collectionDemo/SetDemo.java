package collectionDemo;

import java.util.HashSet;

public class SetDemo {
	
	public static void main(String[] args) {
		
		HashSet<String> s1=new HashSet<String>();  
		
		s1.add(null);
		s1.add("a1");
		s1.add("a5");
		s1.add("abhi");
		s1.add("selenium");
		s1.add("Java");
		s1.add("automation");
		s1.add(null);
		
		
		System.out.println(s1);
		
	}

}
