package keyWordsDemo;

public class InstanceInitBlock2 {
	
	static 
	{
		System.out.println("s");
	}

	{
		System.out.println("i1");
	}
	
	public InstanceInitBlock2()
	{
		//here Instance Initiliser Block will call
		System.out.println("c");
	}
	
	{
		System.out.println("i2");
	}
	
	public static void main(String[] args) {
		
		InstanceInitBlock2 j1 = new InstanceInitBlock2();
		InstanceInitBlock2 j2 = new InstanceInitBlock2();
		
	}
}
