package keyWordsDemo;

public class InstanceInitBlock3 extends SuperIIBParent {
	
	static 
	{
		System.out.println("s");
	}

	{
		System.out.println("i1");
	}
	
	public InstanceInitBlock3()
	{
		//super()
		// i i b
		System.out.println("c");
	}
	
	{
		System.out.println("i2");
	}
	
	public static void main(String[] args) {
		
		InstanceInitBlock3 j1 = new InstanceInitBlock3();
		InstanceInitBlock3 j2 = new InstanceInitBlock3();
		
	}
}
