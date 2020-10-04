package stringDemo;

public class StringPrint3 {
	
	public static void main(String[] args) {
		
		String s1 = "abhi";
		System.out.println("literal way printing s --> "+s1);
		
		char c[] = {'a','b','h','i'};
		String s2 = new String(c); // character array to string we are converting
		System.out.println("char aray of c[] to s2 --> "+s2);
		
		String s3 = new String("abhi");
		System.out.println("by new keword s3 is --> "+s3);
		
	}

}
