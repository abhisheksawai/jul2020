package keyWordsDemo;

public class InstanceInitBlock {
	
	static 
	{
		System.out.println("static block");
	}

	// this is InstanceInitBlock - not req to give name | run when object of class is created
	{
		System.out.println("instance init block");
	}
	
	public static void main(String[] args) {
		
		InstanceInitBlock j = new InstanceInitBlock();
		
	}
}
