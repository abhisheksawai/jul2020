package accessModifiers;


public class DefaultMod {
	
	void dmethod()
	{
		System.out.println("d method from test");
	}
	
	public void dmethodpub()
	{
		System.out.println("dmethodpub");
	}
	
	public static void main(String[] args) {
		
		DefaultMod dm = new DefaultMod();
		dm.dmethod();
	}
}
