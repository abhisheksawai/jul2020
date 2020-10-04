package stringDemo;

public class StringSplit {
	
	public static void main(String[] args) {
		
		String s = "selenium is for automation here";
		
		String swords[] = s.split("\\s");
		
		for(String ss : swords)
		{
			System.out.println(ss);
		}
		
	}

}
