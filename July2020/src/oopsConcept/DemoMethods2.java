package oopsConcept;

public class DemoMethods2 {
	
	public void addition(int a, int b)
	{
		int no1;
		int no2;
		int add;
		add=a+b;
		System.out.println("addiiton is--> "+add);
	}
	
	public void sub()
	{
		System.out.println("substaction - will not call this method");
	}
	
	public static void main(String[] args) {
		
		DemoMethods2 dm = new DemoMethods2();
		dm.addition(22,33);		
	}

}
