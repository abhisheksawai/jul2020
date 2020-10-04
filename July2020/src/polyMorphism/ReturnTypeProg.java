package polyMorphism;


public class ReturnTypeProg {
	
	public void dislpay()
	{
		System.out.println("display method");
	}

	public int addition(int num3)
	{
		int add;
		add = num3+num3;
		//System.out.println("addition of num3+num3 is "+add);
		return add;
	}
	
	public int addition(int num3, String name)
	{
		int add;
		add = num3+num3;
		//System.out.println("addition of num3+num3 is "+add);
		return add;
	}

	public int addition( String name , int num3)
	{
		int add;
		add = num3+num3;
		//System.out.println("addition of num3+num3 is "+add);
		return add;
	}
	
	public void addition(int num3, int num4)
	{
		int add;
		add = num3+num4;
		System.out.println("addition of num3+num4 is "+add);
	}
	
	public static void main(String[] args) {
		
		ReturnTypeProg r = new ReturnTypeProg();
		int getaddition;
		getaddition = r.addition(4);
		System.out.println(getaddition);
		r.dislpay();
		r.addition(400, 500);
		
	}
	
}
