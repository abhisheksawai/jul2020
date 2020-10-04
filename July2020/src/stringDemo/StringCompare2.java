package stringDemo;

public class StringCompare2 {
	
	public static void main(String[] args) {
		
		String s1 = "abhishek";  //scp
		String s2 = "abhishek";
		String s3 = new String("abhishek");  //new memepry
		String s4 = new String ("Abhishek");
		String s5 = "Abhishek";
		String s6 = "Shishir";
		
		System.out.println(s1==(s2));  	// true
		System.out.println(s1==(s3));  	// false
		
		System.out.println(s1.equals(s2));  // true
		System.out.println(s1.equals(s3)); // true
		
	}

}
