package stringDemo;

public class StringToChar {
	
	public static void main(String[] args) {
		
		String s = "selenium";
		
		char c[] = s.toCharArray();
		
		for(int i = 0 ; i < c.length ; i ++)
		{
			System.out.println(c[i]);
		}
		
	}

}
