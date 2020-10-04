package oopsConcept;

public class DemoMethods4 {
	
	public void addition(int a, int b)
	{
		int a=no1;
		int b=no2;
		int add;
		add=no1+no2;
		System.out.println("addiiton is--> "+add);
	}
	
	public void sub()
	{
		System.out.println("substaction - will not call this method");
	}
	
	public static void main(String[] args) {
		
		DemoMethods4 dm = new DemoMethods4();
		dm.addition(22,432);		
		dm.addition(40,50);
		dm.addition(5, 6);
		//dm.addition();
		//dm.addition(10);
		
		
		
	}

}
