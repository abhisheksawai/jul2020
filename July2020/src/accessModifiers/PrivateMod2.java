package accessModifiers;

public class PrivateMod2 {
	
	private  int num1=100;
	
	private void pmethod()
	{
		System.out.println("private pmethod");
	}
	
	
	public static void main(String[] args) {
	
		PrivateMod2 pm = new PrivateMod2();
		System.out.println("created object pm ");
		System.out.println(pm.num1);
		pm.pmethod();
		
	}

}
