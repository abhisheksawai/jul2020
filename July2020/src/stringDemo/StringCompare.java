package stringDemo;

public class StringCompare {
	
	public static void main(String[] args) {
		
		String s1 = "abhishek";
		String s2 = "abhishek";
		String s3 = new String("abhishek");
		String s4 = new String ("Abhishek");
		String s5 = "Abhishek";
		String s6 = "Shishir";
		
		System.out.println(s1.equals(s2));  // true
		System.out.println(s1.equals(s3)); // true
		System.out.println(s1.equals(s4)); // false
		System.out.println(s1.equals(s5));  // false
		System.out.println(s1.equals(s6));  // false
		
		System.out.println(s1.equalsIgnoreCase(s4)); // true
		
		
		
		
		
	}

}
