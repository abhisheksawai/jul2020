package oopsConcept;

public class DemoMethods {
	
	public void addition()
	{
		int no1=10;
		int no2=20;
		int add;
		add=no1+no2;
		System.out.println("addiiton is--> "+add);
	}
	
	public void sub()
	{
		System.out.println("substaction - will not call this method");
	}
	
	public static void main(String[] args) {
		
		DemoMethods dm = new DemoMethods();
		dm.addition();	
		dm.addition();
	}

}
