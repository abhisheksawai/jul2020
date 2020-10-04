package stringDemo;

public class StringConcat2 {
	
	public static void main(String[] args) {
		
		String s = "abhi";
		System.out.println("literal way printing s --> "+s);
		
		System.out.println("m printing s.concat(\" sawai\") --->> "+s.concat(" sawai"));
		
		System.out.println("after concat s value is --> "+s);
		
		s = s.concat(" selenium");
		System.out.println("s = s.concat(\"selenium\");  --->>> "+s);
	}

}
