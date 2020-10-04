package oopsConcept;

public class DemoMethods3 {
	
	public void addition(int a, int b)
	{
		int no1=a;
		int no2=b;
		int add;
		add=no1+no2;
		System.out.println("addiiton is--> "+add);
	}
	
	public void sub()
	{
		System.out.println("substaction - will not call this method");
	}
	
	public static void main(String[] args) {
		
		DemoMethods3 dm = new DemoMethods3();
		dm.addition(22,432);		
		dm.addition(40,50);
		dm.addition(5, 6);
		//dm.addition();
		//dm.addition(10);
		
		
		
	}

}
