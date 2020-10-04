package keyWordsDemo;

public class StaticMethod {
	
	public void s1()
	{
		System.out.println("public void s1 | method");
	}

	public static void s2()  // class method
	{
		System.out.println("public static void s2 | method");
	}
	
	public static void main(String[] args) {
		
		StaticMethod sm = new StaticMethod();
		sm.s1();
		//sm.s2();
		s2();
		
	}
	
}
