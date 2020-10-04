package accessModifiers;

public class ProtMod {
	
	protected void protmethod()
	{
		System.out.println("prot method ");
	}

	protected void protwithinpcks()
	{
		System.out.println("protwithinpcks method ");
	}
	
	public static void main(String[] args) {
		
		ProtMod ptr = new ProtMod();
		ptr.protmethod();
		
	}
	
}
