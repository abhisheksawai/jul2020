package keyWordsDemo;

public class StaticVariableCounter2 {
	
	static int counter=10;  // class variable
	int check;
	
	public StaticVariableCounter2()
	{
		counter++;
		System.out.println(counter);
	}
	
	public static void main(String[] args) {
		
		StaticVariableCounter2 s1 = new StaticVariableCounter2();
		StaticVariableCounter2 s2 = new StaticVariableCounter2();
		StaticVariableCounter2 s3 = new StaticVariableCounter2();
		
		System.out.println("printing in main "+counter);
		System.out.println("printing in main "+s1.check);
		
		//objectname.methodname();
	}
	
}
