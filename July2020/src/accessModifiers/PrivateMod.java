package accessModifiers;

public class PrivateMod {
	
	public  int num1=100;
	
	
	public static void main(String[] args) {
	
		PrivateMod pm = new PrivateMod();
		System.out.println("created object pm ");
		System.out.println(pm.num1);
		//System.out.println(num1);
		//System.out.println("number1 " +num1);
		
	}

}
