package oopsConcept;

public class DemoMethods5 {
	
	public void addition(int a, int b)
	{
		int no1 = 0;
		int no2 = 0;
		a=no1;
		b=no2;
		int add;
		int sum;
		add=no1+no2;
		sum=a+b;
		System.out.println("addiiton is--> "+add); 
		System.out.println("addiiton is--> "+sum); 
		
		//0-rod ,shishir
		//30,30 - mahesh,praj,barsha,mohan
	}
	
	public void sub()
	{
		System.out.println("substaction - will not call this method");
	}
	
	public static void main(String[] args) {
		
		DemoMethods5 dm = new DemoMethods5();
		dm.addition(10,20);		
		
		
		
		
	}

}
