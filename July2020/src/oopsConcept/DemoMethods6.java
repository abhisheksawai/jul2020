package oopsConcept;

public class DemoMethods6 {
	
	public void addition(int a, int b)
	{
		int add=a+b;
		System.out.println("addiiton is--> "+add); 
		
	}
	
	public void sub()
	{
		System.out.println("substaction - will not call this method");
	}
	
	public static void main(String[] args) {
		
		DemoMethods6 dm = new DemoMethods6();
		dm.addition(101,20);		
		
		
		
		
	}

}
