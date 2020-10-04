package keyWordsDemo;

public class StaticVariableCounter {
	
	int counter=10;
	
	public StaticVariableCounter()
	{
		counter++;
		System.out.println(counter);
	}
	
	public static void main(String[] args) {
		
		StaticVariableCounter s1 = new StaticVariableCounter();
		StaticVariableCounter s2 = new StaticVariableCounter();
		StaticVariableCounter s3 = new StaticVariableCounter();
		//objectname.methodname();
	}
	
}
