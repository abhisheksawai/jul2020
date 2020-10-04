package polyMorphism;


public class MethodOver {
	

	public void addition(int num3)
	{
		int add;
		add = num3+num3;
	}
	
	public int addition(int num3)
	{
		int add;
		add = num3+num3;
		//System.out.println("addition of num3+num3 is "+add);
		return add;
	}

	
	public static void main(String[] args) {
		
		MethodOver r = new MethodOver();
	}
	
}
